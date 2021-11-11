package task1;

import java.util.Arrays;

/**
 * @author Speranskaya Ludmila
 * version 1.0
 */

public class HomeWork {
    public static void main(String[] args) {

        System.out.println("1.Фрагмент определения max для 3х чисел.\n");
        
        int a =5;
        int b =6;
        int c = 7;

        int max = 0;

        if(a>b && a>c) {
            max = a;
        }
            else if(b>a && b>c){
                max =b;
            }
            else if (c>a && c>b){
                max = c;
            }else System.out.println("Значение не найдено.");
            
            System.out.println("Максимальное значение: " + max);

        System.out.println("\n2.Фрагмент определения века по заданному году. " +
                "Например, 2021 - 21 век, но 2000 - 20 век.\n");

        int century;
        int year = 1923;

        if(year%100 == 0){
            century = year/100;
        } else {
            century = year/100 + 1;
        }
        System.out.println("Век - " + century);

        System.out.println("\n3.Фрагмент определения високосного года.\n");

        int year1 = 1234;

        if(year1%4 == 0 && year1%100!= 0 || year1%400 == 0){
            System.out.println(year1 + "- високосный год.");
        }else {
            System.out.println(year1 + "- не високосный");
        }

        System.out.println("\n4.Заполнить одномерный целочисленный массив " +
                "из 10 элементов значениями от 2 до 11 включительно с помощью цикла.\n");

        int[] array = new int[10];

        for (int i =0;i<array.length; i++) {
            array[i] = i + 2;
        }
            System.out.println(Arrays.toString(array));


        System.out.println("\n5.Посчитать сумму цифр числа с помощью цикла. " +
                "Например, в числе 123 сумма цифр - 6.\n");

        int x =123;
        int sum = 0;

        while (x!=0) {
            sum = sum + x % 10;
            x = x/10;
        }
        System.out.println("Сумма цифер числа равна - " + sum);

        }
}
