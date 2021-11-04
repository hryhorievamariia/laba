package com.company;
import java.util.Scanner;
public class Lab2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите параметр а:");
        double a = scanner.nextDouble();

        System.out.println("Введите параметр b:");
        double b = scanner.nextDouble();

        System.out.println("Введите параметр c:");
        double c = scanner.nextDouble();

        System.out.println("Введите параметр d:");
        double d = scanner.nextDouble();

//     a = 2.54; b = 1.23;  c = -2.14; d = -0.23;
        System.out.println("Контрольный вывод значений параметров:");
        System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d);
        System.out.println();
        double result = 2*Math.cos(Math.pow(a,b)) + Math.abs(Math.acos(-Math.sqrt(c/d)));
        System.out.println("Результат: " + result);





    }
}





