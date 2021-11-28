package HomeWork21;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {

        Collection<String> strings = new ArrayList<>();
        strings.add("строка1");
        strings.add("строка2");
        strings.add("строка3");
        strings.add("строка4");
        strings.add("строка5");

        Collection<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Василий", "Артеменко",
                "0652289743", 1978));
        contacts.add(new Contact("Анжела", "Донченко",
                "0869473251", 1992));
        contacts.add(new Contact("Давид", "Авокян",
                "0652289743", 1978));
        contacts.add(new Contact("Анжелика", "Агурбаш",
                "0673894625", 1977));
        contacts.add(new Contact("Лариса", "Гузеева",
                "09872281143", 1956));
        contacts.add(new Contact("Павел", "Морозов",
                "0670398624", 1994));
        contacts.add(new Contact("Роман", "Микитюк",
                "0612697428", 1997));

        try {
            writeSimpleData();
            readSimpleData();
            writeStringCollection(strings);
            readStringCollection();
            writeContactCollection(contacts);
            readContactCollection();
            writeContactCollection2(contacts);
            readContactCollection2();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();

        }
    }

    private void writeSimpleData() throws IOException {
        try (DataOutputStream out = new DataOutputStream(
                new FileOutputStream("data.bin"))) {
            out.writeByte(123);
            out.writeInt(1234);
            out.writeFloat(1234);
            out.writeDouble(1234);
            out.writeUTF("hello и привет");

        }
    }

    private void readSimpleData() throws IOException {
        try (DataInputStream in = new DataInputStream(
                new FileInputStream("data.bin"))) {
            System.out.println("readByte() = " + in.readByte());
            System.out.println("readInt() = " + in.readInt());
            System.out.println("readFloat() = " + in.readFloat());
            System.out.println("readDouble() = " + in.readDouble());
            System.out.println("readUTF() = " + in.readUTF());

        }
    }

    private void writeStringCollection(Collection<String> strings) throws IOException {
        try (DataOutputStream out = new DataOutputStream(
                new FileOutputStream("data.bin"))) {
            int size = strings.size();
            out.writeInt(size);
            for (String string : strings) {
                out.writeUTF(string);
            }

        }
    }

    private Collection<String> readStringCollection() throws IOException {
        Collection<String> result = new ArrayList<>();
        try (DataInputStream in = new DataInputStream(
                new FileInputStream("data.bin"))) {
            int size = in.readInt();
            for (int i = 0; i < size; i++) {
                String s = in.readUTF();
                result.add(s);
            }
        }
        return result;
    }

    private void writeContactCollection(Collection<Contact> contacts)
            throws IOException {
        try (DataOutputStream out = new DataOutputStream(
                new FileOutputStream("data.bin"))) {
            int size = contacts.size();
            out.writeInt(size);
            for (Contact contact : contacts) {
                out.writeUTF(contact.getName());
                out.writeUTF(contact.getSurname());
                out.writeUTF(contact.getPhoneNumber());
                out.writeInt(contact.getYearOfBirth());
            }
        }
    }

    private Collection<Contact> readContactCollection() throws IOException {
        Collection<Contact> result = new ArrayList<>();
        try (DataInputStream in = new DataInputStream(
                new FileInputStream("data.bin"))) {
            int size = in.readInt();
            for (int i = 0; i < size; i++) {
                String name = in.readUTF();
                String surname = in.readUTF();
                String phoneNumber = in.readUTF();
                int yearOfBirth = in.readInt();

                result.add(new Contact(name, surname, phoneNumber, yearOfBirth));
            }
            return result;
        }
    }

    private void writeContactCollection2(Collection<Contact> contacts) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("data.bin"))) {
            out.writeObject(contacts);
        }
    }

    private Collection<Contact> readContactCollection2() throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new
                FileInputStream("data.bin"))) {

            Collection<Contact> contacts = (Collection<Contact>) in.readObject();
            return contacts;
        }
    }
}
