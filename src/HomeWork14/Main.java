package HomeWork14;

import HomeWork12.IStudentPrinter;
import HomeWork12.IStudentStringConverter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Student student1 = new Student("Василий", 26);
        Student student2 = new Student("Роберт", 19);

        Student[] students = new Student[]{student1, student2};
        Arrays.sort(students, Student.comparatorByName());
        printStudents(students);
        System.out.println("-----------------------------");
        Arrays.sort(students, Student.comparatorByAge());
        printStudents(students);
        System.out.println("-----------------------------");
        Arrays.sort(students, Student.comparatorByNameAndAge());
        printStudents(students);

        Arrays.sort(students, Student.anonymousComparatorByName());
        printStudents(students);
        System.out.println("-----------------------------");
        Arrays.sort(students, Student.anonymousComparatorByAge());
        printStudents(students);
        System.out.println("-----------------------------");
        Arrays.sort(students, Student.anonymousComparatorByNameAndAge());
        printStudents(students);


    }

    public void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getAge());
        }
    }

    public IStudentStringConverter createConverter() {
        return new IStudentStringConverter() {
            @Override
            public String convert(HomeWork12.Student student) {
                return null;
            }
        };
    }

    public IStudentPrinter createStudentPrinter() {
        return new IStudentPrinter() {
            @Override
            public void print(HomeWork12.Student student) {

            }
        };
    }
}
