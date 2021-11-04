import java.util.Scanner;

public class Lab22 {
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

//        a = 1.25; b = 3.09; c = 4.25;  d = 0.56;
        System.out.println("Контрольный вывод значений параметров:");
        System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d);
        System.out.println();
        double result = 2*Math.sqrt(Math.tan(a)/Math.abs(Math.acos(b)))-3*Math.cbrt(Math.pow(Math.E,c-a)*Math.sinh(d));
        System.out.println("Результат:" + result);

    }
}
