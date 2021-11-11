package HomeWork12;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        doTask2();
        doPrinterTask();
    }

    private void doTask2(){
        IStudentStringConverter converter = randomConverter();

        Student student = new Student("Борис", 23, new BigDecimal("10298.35"));

        String result = converter.convert(student);

        System.out.println(result);

    }

    private IStudentStringConverter randomConverter() {
        double random = Math.random();
        if (random > 0.66) {
            return new StudentJsonConverter();
        } else if (random > 0.33) {
            return new StudentXmlConverter();
        } else {
            return new StudentKeyValue();
        }
    }

    private void doPrinterTask(){
        IStudentPrinter[] printers = new IStudentPrinter[]{
                new ConsolePrinter(new StudentJsonConverter()),
                new ConsolePrinter(new StudentKeyValue()),
                new ConsolePrinter(new StudentXmlConverter()),
                new NowherePrinter()};
        Student student = new Student("Антонина", 19, new BigDecimal("7298.14"));
        IStudentPrinter printer = new DelegatingStudentPrinter(printers);
        printer.print(student);
    }
}
