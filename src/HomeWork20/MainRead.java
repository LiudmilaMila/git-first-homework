package HomeWork20;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class MainRead {
    public static void main(String[] args) {

        try {
            new MainRead().run2();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        try {
            new MainRead().run4();
        } catch (IOException e) {
            e.printStackTrace();
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


    private void run4() throws IOException {
        List<Contact> contacts = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("contacts.txt"), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Scanner scanner = new Scanner(line);
                scanner.useDelimiter("\\|");
                String name = scanner.next();
                String surname = scanner.next();
                String phoneNumber = scanner.next();
                int yearOfBirth = scanner.nextInt();

                contacts.add(new Contact(name, surname, phoneNumber, yearOfBirth));
            }
        }
        Collections.sort(contacts, new Comparator<Contact>() {
            @Override
            public int compare(Contact o1, Contact o2) {
                return Integer.compare(o1.getYearOfBirth(), o2.getYearOfBirth());
            }
        });
        final String linePattern = "%s|%s|%s|%s%n";
        for (int i = 0; i < Math.min(contacts.size(), 5); i++) {
            Contact contact = contacts.get(i);
            System.out.printf(linePattern, contact.getName(),
                    contact.getSurname(),
                    contact.getPhoneNumber(),
                    contact.getYearOfBirth());

        }
    }
}
