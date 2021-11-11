package task2;
/**
 * @author Speranskaya Ludmila
 * version 1.0
 */

import java.util.Locale;

public class Lesson2 {

    public static void main(String[] args) {

        System.out.println("Задача 1.");

        System.out.println("Var 1:");

        double[] array = {3.1458, 2.8964, 6.90345, -2.54656, 1235.0034};

        System.out.print("\n(");

        for (int i = 0; i < array.length; i++) {

            System.out.printf(Locale.ROOT, "%.2f", array[i]);

            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(")");

        System.out.println("\nVar 2: ");

        double[] array1 = {3.1458, 2.8964, 6.90345, -2.54656, 1235.0034};

        System.out.print("\n(");

        for (int i = 0; i < array1.length; i++) {

            if (i > 0) {
                System.out.print(", ");
            }
            System.out.printf(Locale.ROOT, "%.2f", array1[i]);
        }
        System.out.print(")");

        System.out.println("\nVar 3: ");

        double[] array2 = {3.1458, 2.8964, 6.90345, -2.54656, 1235.0034};

        System.out.print("\n(");

        for (int i = 0; i < array2.length; i++) {

            System.out.printf(Locale.ROOT, "%.2f", array2[i]);

            if (i != array2.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.print(")");

        System.out.println("\nЗадача 2.");

        int a = 2;
        int b = 4;
        int c = 7;

        int result = a + b + c;
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = a * b * c;
        int result4 = (a + b) * c;
        int result5 = a * (b + c);

        int max = result;

        if (result1 > max) {
            max = result1;
        }
        if (result2 > max) {
            max = result2;
        }
        if (result3 > max) {
            max = result3;
        }
        if (result4 > max) {
            max = result4;
        }
        if (result5 > max) {
            max = result5;
        }
        System.out.println("\nМаксимальное значение: " + max);

        System.out.println("\nЗадача 3.");

        int x = 5;

        for (int i = 1; i <=10; i++) {

           int mult = i * x;

            System.out.println(i + "*" + x + "=" + mult);

        }
        System.out.println("\nЗадача 4.");

        String str = "423465312534516241536514166555166513561536151365631";
//            преобразовывваем строку в массив
        char[] chArray = str.toCharArray();
        int sum = 0;

        for (int z = 0; z < chArray.length; z++) {

            int number = chArray[z] - 48;
            sum = sum + number;

        }

        String goal = sum % 3 == 0 ? " делится " : " не делится";
        System.out.println("Число " + str + goal + " на три");
    }
}


//        Наброски к решению задачи , вернусь к ней позже.

//        System.out.println("\nЗадача 5.");
//
//        final long inputSecond = 154554545415L;
//        long remains = inputSecond;
//        long year = remains / 31536000;
//        remains = remains % 31536000;
//        long day = remains / 86400;
//        remains = remains % 86400;
//        long hour = remains / 3600;
//        remains = remains % 3600;
//        long minute = remains / 60;
//        remains = remains % 60;
//        long second = remains;
//
//        if (year != 0 || day != 0 || hour != 0 || minute != 0 || second != 0) {
//            System.out.println("В " + inputSecond + " секундах " + year + " лет, " + day + " дней, "
//                    + hour + " часов, " + minute + " минут, " + second + " секунд.");
//        }
//        if (year == 0) {
//            System.out.println("В " + inputSecond + " секундах " + day + " дней, "
//                    + hour + " часов, " + minute + " минут, " + second + " секунд.");
//        }
//        if (day == 0) {
//            System.out.println("В " + inputSecond + " секундах " + year + " лет, "
//                    + hour + " часов, " + minute + " минут, " + second + " секунд.");
//        }
//        if (hour == 0) {
//            System.out.println("В " + inputSecond + " секундах " + year + " лет, " + day + " дней, "
//                    + minute + " минут, " + second + " секунд.");
//        }
//        if (minute == 0) {
//            System.out.println("В " + inputSecond + " секундах " + year + " лет, " + day + " дней, "
//                    + hour + " часов, " + second + " секунд.");
//        }
//        if (second == 0) {
//            System.out.println("В " + inputSecond + " секундах " + year + " лет, " + day + " дней, "
//                    + hour + " часов, " + minute + " минут.");
//        }