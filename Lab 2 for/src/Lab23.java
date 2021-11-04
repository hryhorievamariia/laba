import java.util.Scanner;

public class Lab23 {
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
//        a = 2.98;  b = 5.55;  c = 0.045;  d = 0.129;

        System.out.println("Контрольный вывод значений параметров:");
        System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d);
        System.out.println();
        double result = Math.pow(a,b)/Math.cosh(Math.abs(b))+4*Math.log10(c)/Math.pow(d,0.2);
        System.out.println("Результат: " + result);


        }
}
