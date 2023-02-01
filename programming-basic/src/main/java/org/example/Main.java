package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         *   basic of software code deveopment - dasturiy ta'minot kodini ishlab chiqish asoslari
         *
         * Для закрепления навыков по данной теме пешите следующей задачи - Ushbu mavzu bo'yicha ko'nikmalaringizni mustahkamlash uchun quyidagi vazifani bajaring
         *
         *            линейный программъ -  chiziqli dastur
         */
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
        task6();
//        task7();
    }

    private static double scannerDouble() {
        Scanner in = new Scanner(System.in);
        double number;
        System.out.print("Insert the number: ");
        while (!in.hasNextDouble()) {
            in.next();
            System.out.println("Invalid input!");
            System.out.print("Insert the number: ");
        }
        number = in.nextDouble();
        return number;
    }

    public static int scannerInt() {
        Scanner in = new Scanner(System.in);
        int number;
        System.out.print("Insert the number: ");
        while (!in.hasNextInt()) {
            in.next();
            System.out.println("Invalid input!");
            System.out.print("Insert the number: ");
        }
        number = in.nextInt();
        return number;
    }

    //1-найдите значение функции z=((a-3)*b/2)+c.
    public static void task1() {
        double a = scannerDouble();
        double b = scannerDouble();
        double c = scannerDouble();
        double z = ((a - 3) * b / 2) + c;
        System.out.println(z);
    }

    //Вычислить значение выражения по формуле ( все переменные принимают действительные значения )
    public static void task2() {
        int a = scannerInt();
        int b = scannerInt();
        int c = scannerInt();
        double z = (b + Math.sqrt(b * b + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + 1.0 / b * b;
        System.out.println(z);
    }

    //Вычислить значение выражения по формуле ( все переменные принимают действительные значения )
    public static void task3() {
        double x = scannerDouble();
        double y = scannerDouble();
        double z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
        System.out.println(z);
    }

    /**
     * 4. Дано действительное число R вида nnn.ddd ( три цифровых разряда в дробной и целой частях ) .
     * Поменять местами дробную и целую части числа и вывести полученное значение числа .
     */
    public static void task4() {
        double a = scannerDouble();
        String s = String.valueOf(a);
        System.out.println(s.substring(4) + s.charAt(3) + s.substring(0, 3));
    }

    /**
     * 5. Дано натуральное число Т , которое представляет длительность прошедшего времени в секундах .
     * Вывести Данное значение длительности в часах , минутах и секундах в следующей форме : Hнч Мммин SSC
     */
    public static void task5() {
        int T = scannerInt();
        System.out.println(
                "Hour: " + T / 3600
                        + " Minutes: " + T / 60 / 60
                        + " seconds: : " + T / 60
        );
    }

    /**
     * 6. Для данной области составить линейную программу , которая печатает true ,
     * если точка с координатами ( x , y ) принадлежит закрашенной области , и false - в противном случае :
     */
    public static void task6() {
        String repeated = "Java".repeat(5);
        System.out.println(repeated);
    }

    /**
     *
     */
    public static void task7() {

    }
}