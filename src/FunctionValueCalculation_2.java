import java.util.Scanner;

public class FunctionValueCalculation_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите x: ");
        double x = input.nextDouble();
        double a = 2.27;
        double b = 1.18;
        double c = 3.92;

        double y = Math.pow(((a / (b * Math.pow(x, 2) + c)) + b * Math.pow(Math.sin(x), 2)), 2);
        System.out.println("y = " + y);
    }
}