package HomeWork14;

import java.util.Comparator;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Comparator<Student> anonymousComparatorByName() {
        return new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return student1.name.compareTo(student2.name);
            }
        };
    }

    public static Comparator<Student> anonymousComparatorByAge() {
        return new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return Integer.compare(student1.age, student2.age);
            }
        };
    }

    public static Comparator<Student> anonymousComparatorByNameAndAge() {
        return new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                int result;

                result = student1.name.compareTo(student2.name);
                if (result != 0) {
                    return result;
                }
                result = Integer.compare(student1.age, student2.age);
                if (result != 0) {
                    return result;
                }
                return result;
            }
        };
    }

    public static Comparator<Student> comparatorByName() {
        return new ComparatorByName();
    }

    public static Comparator<Student> comparatorByAge() {
        return new ComparatorByAge();
    }

    public static Comparator<Student> comparatorByNameAndAge() {
        return new ComparatorByNameAndAge();
    }

    private static class ComparatorByName implements Comparator<Student> {
        @Override
        public int compare(Student student1, Student student2) {
            return student1.name.compareTo(student2.name);
        }
    }

    private static class ComparatorByAge implements Comparator<Student> {
        @Override
        public int compare(Student student1, Student student2) {
            return Integer.compare(student1.age, student2.age);
        }
    }

    private static class ComparatorByNameAndAge implements Comparator<Student> {
        @Override
        public int compare(Student student1, Student student2) {
            int result;

            result = student1.name.compareTo(student2.name);
            if (result != 0) {
                return result;
            }
            result = Integer.compare(student1.age, student2.age);
            if (result != 0) {
                return result;
            }
            return result;
        }
    }

}
