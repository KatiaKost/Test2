import java.util.Scanner;

public class FunctionValueCalculationWithCondition_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите x: ");
        double x = input.nextDouble();
        double y;

        if (x <= 1) {
            System.out.print("Введите a: ");
            double a = input.nextDouble();

            y = (a * Math.pow(Math.sin(x), 2)) + Math.sqrt(x);

            System.out.println("y = " + y);
        } else if (x > 1) {
            System.out.print("Введите b: ");
            double b = input.nextDouble();

            y = b * Math.exp(Math.pow(x, 2));

            System.out.println("y = " + y);
        }
    }
}