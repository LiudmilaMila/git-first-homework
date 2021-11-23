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
                writer.print(a + " ");
            }
        }
    }

    private void run2() throws FileNotFoundException {
        Collection<Integer> values = new ArrayList<>();
        try (Scanner scanner = new Scanner(
                new FileInputStream("random.txt"), StandardCharsets.UTF_8.name())) {
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
        System.out.println();
        System.out.println(average);
    }
}
