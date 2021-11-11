package task3;

public class StudentFactory {

    public int minAge;
    public int maxAge;
    public String[] names;


    public Student createStudent() {

        Student student = new Student();

        student.age = (int) ((Math.random() * (maxAge - minAge + 1)) + minAge);

        int randomIndex = (int) (Math.random() * names.length);
        student.name = names[randomIndex];

        return student;

    }
}
