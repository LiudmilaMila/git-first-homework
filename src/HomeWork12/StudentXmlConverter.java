package HomeWork12;

public class StudentXmlConverter implements IStudentStringConverter {

    public String convert(Student student) {
        StringBuilder builder = new StringBuilder();
        builder.append("<").append("student").append(">").append("\n");
        builder.append("\t")
                .append("<").append("name").append(">")
                .append(student.name)
                .append("<").append("/").append("name").append(">")
                .append("\n");
        builder.append("\t")
                .append("<").append("age").append(">")
                .append(student.age)
                .append("<").append("/").append("age").append(">")
                .append("\n");
        builder.append("\t")
                .append("<").append("salary").append(">")
                .append(student.salary)
                .append("<").append("/").append("salary").append(">")
                .append("\n");
        builder.append("<").append("/").append("student").append(">");

        return builder.toString();
    }
}
