package HomeWork12;

public class StudentJsonConverter implements IStudentStringConverter {
    @Override
    public String convert(Student student) {
        StringBuilder builder = new StringBuilder();
        builder.append("{").append("\n");
        builder.append("\t")
                .append("\"").append("name").append("\"")
                .append(":")
                .append("\"").append(student.name).append("\"")
                .append(",").append("\n");
        builder.append("\t")
                .append("\"").append("age").append("\"")
                .append(":").append(student.age)
                .append(",").append("\n");
        builder.append("\t")
                .append("\"").append("salary").append("\"")
                .append(":").append(student.salary)
                .append("\n");
        builder.append("}");
        return builder.toString();
    }
}
