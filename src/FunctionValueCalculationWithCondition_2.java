import java.util.Scanner;

public class FunctionValueCalculationWithCondition_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите x: ");
        double x = input.nextDouble();
        double y;

        if (x > 0) {
            System.out.print("Введите a: ");
            double a = input.nextDouble();

            y = a + ((1.0 / 2) * (Math.exp(-x)));

            System.out.println("y = " + y);
        } else if (x <= 0) {
            System.out.print("Введите b: ");
            double b = input.nextDouble();

            y = Math.cos((b * x) + 1);

            System.out.println("y = " + y);
        }
    }
}