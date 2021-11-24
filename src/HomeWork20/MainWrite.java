package HomeWork20;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;

public class MainWrite {
    public static void main(String[] args) {
        try {
            new MainWrite().run();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            new MainWrite().run1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            new MainWrite().run3();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private void run() throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(
                new FileOutputStream("text.txt"))) {
            writer.println("Hello, world!");
        }
    }

    private void run1() throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(
                new FileOutputStream("random.txt"))) {
            for (int i = 0; i < 1000; i++) {
                int a = (int) (Math.random() * (1150 + 1)) - 500;
                writer.print(a + ", ");
            }
        }
    }


    private void run3() throws FileNotFoundException {
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
        contacts.add(new Contact("Роман", "Цовма",
                "0670318864", 1990));
        contacts.add(new Contact("Анастасия", "Коц",
                "0664790215", 1985));
        contacts.add(new Contact("Ирина", "Лебедь",
                "0630497621", 1984));

        try (PrintWriter writer = new PrintWriter(
                new FileOutputStream("contacts.txt"))) {
            final String linePattern = "%s|%s|%s|%s%n";
            for (Contact contact : contacts) {
                writer.printf(linePattern, contact.getName(),
                        contact.getSurname(),
                        contact.getPhoneNumber(),
                        contact.getYearOfBirth());
            }
        }
    }


}
