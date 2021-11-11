package task5.noHumans;

import task5.humans.Student;

public class Group {

    private Student[] students;
    private String name;

    public Group(Student[] students, String name) {
        this.students = students;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
