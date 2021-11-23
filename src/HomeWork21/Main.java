package HomeWork21;

import java.io.*;

public class Main {
    public static void main(String[] args) {


        try {
            new Main().writeSimpleData();
            new Main().readSimpleData();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeSimpleData() throws IOException {
        try(DataOutputStream out = new DataOutputStream(new FileOutputStream("data.bin"))){
            out.writeByte(123);
            out.writeInt(1234);
            out.writeFloat(1234);
            out.writeDouble(1234);
            out.writeUTF("hello и привет");

        }
    }

    private void readSimpleData()throws IOException {
        try (DataInputStream in = new DataInputStream(
                new FileInputStream("data.bin"))){
            System.out.println("readByte() = " + in.readByte());
            System.out.println("readInt() = " + in.readInt());
            System.out.println("readFloat() = " + in.readFloat());
            System.out.println("readDouble() = " + in.readDouble());
            System.out.println("readUTF() = " + in.readUTF());

        }
    }
}
