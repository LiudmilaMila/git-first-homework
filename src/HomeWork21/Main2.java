package HomeWork21;

import java.io.*;


public class Main2 {
    private long result1;
    private long result2;
    private long result3;
    private long result4;

    public static void main(String[] args) {
        new Main2().run2();
    }

    private void run2() {

        try {
            readData();
            readData2();
            readData3();
            readData4();
        } catch (IOException e) {
            e.printStackTrace();
        }

        printTimeResults();
    }


    private void readData() throws IOException {
        long start = System.nanoTime();
        try (InputStream in =
                     new FileInputStream
                             ("E:\\Java\\Elementary\\videoplayback.mp4");
             OutputStream out = new FileOutputStream("E:\\Java\\Elementary\\copy1OfVideo.mp4")) {
            byte[] chunk = new byte[4096];
            while (in.available() > 0) {
                int readCount = in.read(chunk);
                if (readCount <= 0) {
                    break;
                }
                out.write(chunk, 0, readCount);
            }
        }
        long end = System.nanoTime();
        result1 = (end - start) / 1000000000;
    }

    private void readData2() throws IOException {
        long start = System.nanoTime();
        try (InputStream in =
                     new FileInputStream("E:\\Java\\Elementary\\videoplayback.mp4");
             OutputStream out = new FileOutputStream("E:\\Java\\Elementary\\copy2OfVideo.mp4")) {
            while (in.available() > 0) {
                int result = in.read();
                out.write(result);
            }
        }
        long end = System.nanoTime();
        result2 = (end - start) / 1000000000;
    }

    private void readData3() throws IOException {
        long start = System.nanoTime();
        try (BufferedInputStream in = new BufferedInputStream(
                new FileInputStream("E:\\Java\\Elementary\\videoplayback.mp4"));
             BufferedOutputStream out = new BufferedOutputStream(
                     new FileOutputStream("E:\\Java\\Elementary\\copy3OfVideo.mp4"))) {
            while (in.available() > 0) {
                int result = in.read();
                out.write(result);
            }
        }
        long end = System.nanoTime();
        result3 = (end - start) / 1000000000;
        ;
    }

    private void readData4() throws IOException {
        long start = System.nanoTime();
        try (BufferedInputStream in = new BufferedInputStream(
                new FileInputStream("E:\\Java\\Elementary\\videoplayback.mp4"));
             BufferedOutputStream out = new BufferedOutputStream(
                     new FileOutputStream("E:\\Java\\Elementary\\copy4OfVideo.mp4"))) {
            byte[] chunk = new byte[4096];
            while (in.available() > 0) {
                int readCount = in.read(chunk);
                if (readCount <= 0) {
                    break;
                }
                out.write(chunk, 0, readCount);
            }
        }
        long end = System.nanoTime();
        result4 = (end - start) / 1000000000;
    }

    private void printTimeResults() {
        System.out.println("Время копирования первым способом " + result1 + "секунд(ы)");
        System.out.println("Время копирования вторым способом " + result2 + "секунд(ы)");
        System.out.println("Время копирования третьим способом " + result3 + "секунд(ы)");
        System.out.println("Время копирования четвёртым способом " + result4 + "секунд(ы)");

        Long[] results = new Long[]{result1, result2, result3, result4};
        long min = results[0];
        long gotResult = 0;
        for (int i = 0; i < results.length; i++) {
            if (results[i] < min) {
                min = results[i];
                gotResult = i + 1;

            }
        }
        System.out.println("Самый быстрый способ копирования - метод " +
                gotResult + " , копирует за " + min + " секунды");
    }
}