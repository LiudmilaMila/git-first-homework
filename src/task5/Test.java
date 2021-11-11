package task5;

import task5.humans.Student;
import task5.humans.Teacher;
import task5.noHumans.*;

public class Test {
    public static void main(String[] args) {

        Test test = new Test();
        test.run();
    }

    private void run() {

        Student student1 = new Student("Донченко", 19);
        Student student2 = new Student("Васильев", 17);
        Student student3 = new Student("Данилевскаий", 18);
        Student student4 = new Student("Яценко", 17);
        Student student5 = new Student("Свиридова", 18);
        Student student6 = new Student("Чумаченкро", 17);
        Student student7 = new Student("Кулик", 19);
        Student student8 = new Student("Базарова", 17);
        Student student9 = new Student("Мороз", 18);
        Student student10 = new Student("Кирко", 19);
        Student student11 = new Student("Самойлова", 18);
        Student student12 = new Student("Полищук", 17);

        Teacher teacher1 = new Teacher("Иванов", "История");
        Teacher teacher2 = new Teacher("Сидоров", "Математика");
        Teacher teacher3 = new Teacher("Бовкун", "Физика");
        Teacher teacher4 = new Teacher("Овчинникова", "Информатика");


        Audience audience1 = new Audience("B-23.Л");
        Audience audience2 = new Audience("123.Л");
        Audience audience3 = new Audience("12.2К");
        Audience audience4 = new Audience("46.ПТ");

        Group group1 = new Group(new Student[]{student1, student2, student3}, "OПУТ-45");
        Group group2 = new Group(new Student[]{student4, student5, student6}, "OТ-12.ЛД.");
        Group group3 = new Group(new Student[]{student7, student8, student9}, "ОППу-2");
        Group group4 = new Group(new Student[]{student10, student11, student12}, "ОППу-4");

        Cathedra cathedra1 = new Cathedra(new Teacher[]{teacher1, teacher2},
                new Audience[]{audience1, audience2}, "МашCтрой.");
        Cathedra cathedra2 = new Cathedra(new Teacher[]{teacher3, teacher4},
                new Audience[]{audience2, audience3}, "ССМН");

        Faculty faculty1 = new Faculty(new Cathedra[]{cathedra1}, "Строительный");
        Faculty faculty2 = new Faculty(new Cathedra[]{cathedra2}, "Механический");

        TimeTable line1 = new TimeTable(DayOfWeek.MON, group1, TimeOfLesson.FIRST, audience1, teacher1);
        TimeTable line2 = new TimeTable(DayOfWeek.MON, group3, TimeOfLesson.THIRD, audience3, teacher2);
        TimeTable line3 = new TimeTable(DayOfWeek.TUE, group2, TimeOfLesson.SECOND, audience4, teacher3);
        TimeTable line4 = new TimeTable(DayOfWeek.WED, group4, TimeOfLesson.FOURTH, audience2, teacher2);
        TimeTable line5 = new TimeTable(DayOfWeek.THU, group4, TimeOfLesson.FIRST, audience1, teacher4);
        TimeTable line6 = new TimeTable(DayOfWeek.THU, group2, TimeOfLesson.THIRD, audience3, teacher2);
        TimeTable line7 = new TimeTable(DayOfWeek.FRI, group3, TimeOfLesson.SECOND, audience4, teacher1);

        TimeTable[] lines = new TimeTable[]{line1, line2, line3, line4, line5, line6, line7};

        printTable(lines);
    }

    private void printTable(TimeTable[] lines) {

        final String titlePattern = "|%12s|%10s|%6s|%10s|%14s|%12s|%n";
        final String linePattern = "|%12s|%10s|%6s|%10s|%14s|%12s|%n";

        System.out.printf(titlePattern,
                "День недели",
                "Группа",
                "Время",
                "Аудитория",
                "Преподаватель",
                "Предмет");

        for (TimeTable line : lines) {
            System.out.printf(linePattern,
                    transform(line.getDayOfWeek()),
                    line.getGroup().getName(),
                    line.getTimeOfLesson().getStartOfLesson(),
                    line.getAudience().getName(),
                    line.getTeacher().getName(),
                    line.getTeacher().getSubject());
        }
    }

    private String transform(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MON:
                return "Понедельник";
            case TUE:
                return "Вторник";
            case WED:
                return "Среда";
            case THU:
                return "Четверг";
            case FRI:
                return "Пятница";

            default:
                return "Выходной";

        }
    }
}
