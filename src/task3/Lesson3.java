package task3;

/**
 * @author Speranskaya Ludmila
 * version 1.0
 */

public class Lesson3 {

    public static void main(String[] args) {
        Lesson3 lesson3 = new Lesson3();
        lesson3.run();
    }

    private void run() {

        doTask1();
        doAllTasks();
    }

    private void doTask1() {
        System.out.println("\nЗадача 1:");

        Student student1 = new Student();
        student1.name = "Михаил";
        student1.age = 19;

        Student student2 = new Student();
        student2.name = "Ирина";
        student2.age = 18;

        Student student3 = new Student();
        student3.name = "Андрей";
        student3.age = 19;


        Student student4 = new Student();
        student4.name = "Ирина";
        student4.age = 18;

        Student student5 = new Student();
        student5.name = "Андрей";
        student5.age = 19;

        Student[] students = new Student[6];

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;
        students[5] = new Student();
        students[5].name = "Карина";
        students[5].age = 20;


        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ". " + students[i].name + " " + students[i].age);
        }
    }

    private void doAllTasks() {

        System.out.println("\nЗадача 2:");

        Student[] students = new Student[6];
        StudentFactory studentFactory = new StudentFactory();
        studentFactory.minAge = 18;
        studentFactory.maxAge = 35;
        studentFactory.names = new String[]{"Алексей", "Денис", "Мария", "Людмила", "Роман"};

        for (int i = 0; i < students.length; i++) {
            students[i] = studentFactory.createStudent();
        }

//        sortByName(students);
//        sortByAge(students);

        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + " " + students[i].name + " " + students[i].age);
        }

        Student foundStudent = findStudent(students, "е");
        if (foundStudent != null) {
            System.out.println("Найденый студент : " + foundStudent.name + " "
                    + foundStudent.age);
        } else {
            System.out.println("Совпадение не найдено.");
        }

        Student[] foundStudents = findStudents(students, "юд");
        System.out.println("Найденые студенты : ");
        if (foundStudents.length > 0) {
            for (int i = 0; i < foundStudents.length; i++) {
                System.out.println((i + 1) + " " + foundStudents[i].name +
                        " " + foundStudents[i].age);
            }
        } else {
            System.out.println("Совпадения не найдены.");
        }
    }

    private void sortByAge(Student[] students) {

        for (int i = 0; i < students.length; i++) {
            for (int j = 1; j < students.length - i; j++) {
                if (students[j - 1].age > students[j].age) {
                    Student temp = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    private void sortByName(Student[] students) {

        for (int i = 0; i < students.length; i++) {
            for (int j = 1; j < students.length - i; j++) {
                if (students[j - 1].name.compareTo(students[j].name) > 0) {
                    Student temp = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    private Student findStudent(Student[] students, String text) {

        Student foundStud = null;

        for (int i = 0; i < students.length; i++) {
            if (students[i].name.contains(text)) {
                foundStud = students[i];
                break;
            }
        }
        return foundStud;
    }

    private Student[] findStudents(Student[] students, String text) {
        Student[] foundStudents = new Student[students.length];
        int k = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i].name.contains(text)) {

                foundStudents[k] = students[i];
                k++;
            }
        }
        Student[] result = new Student[k];

        for (int i = 0; i < result.length; i++) {
            result[i] = foundStudents[i];
        }

        return result;
    }
}
