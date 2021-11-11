package HomeWork12;

public class StudentKeyValue implements IStudentStringConverter {
    public String convert(Student student) {
        StringBuilder builder = new StringBuilder();
        builder.append("name = ").append(student.name).append("\n");
        builder.append("age = ").append(student.age).append("\n");
        builder.append("salary = ").append(student.salary).append("\n");
        return builder.toString();
    }
}
