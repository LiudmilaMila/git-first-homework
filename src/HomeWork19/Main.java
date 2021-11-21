package HomeWork19;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Student student = new Student();
        student.setAge(27);
        student.setName("Андрей");

        System.out.println("Возраст : " + student.getAge()
                + "\nИмя " + student.getName());

        try {
            deserialize("строка");
        } catch (MyDomainException e) {
            System.out.println("Исключение, положенное в основу текущего исключения. " +
                    "\nЕсли такое исключение отсутствует," +
                    " то возвращается пустое значение null: " + e.getCause());
            System.out.println("Описание исклюсения: " + e.getMessage());
            System.out.println("Отображение трассы стека: ");
            e.printStackTrace(System.out);
        }

        try {
            function1();
        } catch (MyDomainException e) {
            e.printStackTrace();
        }
        System.out.println("--------------");

        try {
            function2();
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        doTask8and9();
    }

    private void doTask8and9() {
        try {
            deserialize("строка");

        } catch (NumberFormatException e) {
            System.out.println("Ошибка " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка " + e.getMessage());
        } catch (MyDomainException e) {
            System.out.println("Ошибка " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка " + e.getMessage());
        } finally {
            System.out.println("В блоке finally");
        }
    }

    private void function2() {
        try {
            deserialize("строка");
        } catch (MyDomainException e) {
            System.out.println("Ошибка: " + e.getMessage());
            throw new IllegalArgumentException(e);
        }
    }


    private void function1() throws MyDomainException {
        try {
            deserialize("строка");

        } catch (MyDomainException e) {
            throw e;
        }
    }

    private Student deserialize(String s) throws MyDomainException {
        throw new MyDomainException();
    }
}

