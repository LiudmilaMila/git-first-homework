package HomeWork12;

public class ConsolePrinter implements IStudentPrinter {
    private IStudentStringConverter converter;

    public ConsolePrinter(IStudentStringConverter converter) {
        this.converter = converter;
    }

    @Override
    public void print(Student student) {
        String result = converter.convert(student);
        System.out.println(result);

    }
}
