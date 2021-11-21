package HomeWork21;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

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

//        try {
//            new Main().run2();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
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
                writer.print(a);
                if (i < 999) {
                    writer.print(", ");
                }
            }
        }
    }

//    private void run2() throws FileNotFoundException {
//        Collection<Integer> values = new ArrayList<>();
//        try(Scanner scanner = new Scanner(
//                new FileInputStream("doTask3"), StandardCharsets.UTF_8.name())){
//            while (){
//                values.add(scanner.nextInt());
//
//            }
//        }
//    }
}
