package HomeWork20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            new Main().run();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            new Main().run1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            new Main().run2();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            new Main().run3();
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

    private void run2() throws FileNotFoundException {
        Collection<Integer> values = new ArrayList<>();
        try (Scanner scanner = new Scanner(
                new FileInputStream("random.txt"), StandardCharsets.UTF_8.name())) {
            scanner.useDelimiter(", ");
            int count = 0;
            while (scanner.hasNextInt() && count < 100) {

                int a = scanner.nextInt();
                if (a > 0) {
                    values.add(a);
                }
                count++;
            }

        }
        int sum = 0;
        for (Integer value : values) {
            sum += value;

        }
        double average = ((double) sum) / values.size();
        System.out.println(average);
    }

    private void run3() throws FileNotFoundException {
        Collection<Contact> contacts = new ArrayList<>();
        contacts.add(new HomeWork20.Contact("Василий", "Артеменко",
                "0652289743", 1978));
        contacts.add(new Contact("Анжела", "Донченко",
                "0869473251", 1992));
        contacts.add(new HomeWork20.Contact("Давид", "Авокян",
                "0652289743", 1978));
        contacts.add(new HomeWork20.Contact("Анжелика", "Агурбаш",
                "0673894625", 1977));
        contacts.add(new HomeWork20.Contact("Лариса", "Гузеева",
                "09872281143", 1956));
        contacts.add(new HomeWork20.Contact("Павел", "Морозов",
                "0670398624", 1994));
        contacts.add(new HomeWork20.Contact("Роман", "Микитюк",
                "0612697428", 1997));
        contacts.add(new HomeWork20.Contact("Роман", "Цовма",
                "0670318864", 1990));
        contacts.add(new HomeWork20.Contact("Анастасия", "Коц",
                "0664790215", 1985));
        contacts.add(new HomeWork20.Contact("Ирина", "Лебедь",
                "0630497621", 1984));

        try (PrintWriter writer = new PrintWriter(
                new FileOutputStream("contacts.txt"))) {
            final String linePattern = "%11s|%11s|%11s|%6s%n";
            for (Contact contact : contacts) {
                writer.printf(linePattern, contact.getName(),
                        contact.getSurname(),
                        contact.getPhoneNumber(),
                        contact.getYearOfBirth());
            }
        }
    }
}
