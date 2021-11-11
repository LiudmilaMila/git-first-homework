package task5.noHumans;

import task5.humans.Teacher;

public class Cathedra {

    private Teacher[] teachers;
    private Audience[] audiences;
    private String name;

    public Cathedra(Teacher[] teachers, Audience[] audiences, String name) {
        this.teachers = teachers;
        this.audiences = audiences;
        this.name = name;
    }
}
