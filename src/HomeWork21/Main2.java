package HomeWork21;

import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        new Main2().run2();
    }

    private void run2() {
        try {
//            readData();
            readData2();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


//    private void readData() throws IOException {
//        try (InputStream in =
//                     new FileInputStream
//                             ("E:\\Java\\Elementary\\videoplayback.mp4");
//             OutputStream out = new FileOutputStream("E:\\Java\\Elementary\\copy1OfVideo.mp4")) {
//            byte[] chunk = new byte[4096];
//            while (in.available() > 0) {
//                int readCount = in.read(chunk);
//                if (readCount <= 0) {
//                    break;
//                }
//                out.write(chunk, 0, readCount);
//            }
//        }
//    }

    private void readData2() throws IOException {
        try (InputStream in =
                     new FileInputStream("E:\\Java\\Elementary\\videoplayback.mp4");
             OutputStream out = new FileOutputStream("E:\\Java\\Elementary\\copy2OfVideo.mp4")) {
            while (in.available() > 0) {
                int result = in.read();
                out.write(result);
            }
        }
    }


}