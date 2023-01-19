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
        task1();
        task2();
    }

    private static double scannerDouble(){
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

    public static int scannerInt(){
        Scanner in = new Scanner(System.in);
        int number;
        System.out.println("Insert the number: ");
        while (!in.hasNextInt()) {
            in.next();
            System.out.println("Invalid input!");
            System.out.print("Insert the number: ");
        }
        number = in.nextInt();
        return number;
    }

    //1-найдите значение функции z=((a-3)*b/2)+c.  -  funksiya qiymatini toping
    public static void task1()  {
        double a = scannerDouble();
        double b = scannerDouble();
        double c = scannerDouble();
        double z = ((a-3)*b/2)+c;
        System.out.println(z);
    }

    public static void task2(){

    }

}