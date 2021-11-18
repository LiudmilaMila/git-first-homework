package HomeWork19;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Student student = new Student();
        student.setAge(15);
        student.setName("А");


        System.out.println("Возраст : " + student.getAge()
        + "\nИмя " + student.getName());

    }

    private Student deserialize(String s) throws MyDomainException {
        throw new MyDomainException();
    }
}

