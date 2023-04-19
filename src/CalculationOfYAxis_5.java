import java.util.Scanner;

public class CalculationOfYAxis_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double y;
        System.out.print("Введите x: ");
        double x = input.nextDouble();
        System.out.print("Введите Радиус: ");
        double r = input.nextDouble();

        if (x >= -4 && x < -2) {
            y = x + 3;
            System.out.println("y = " + y);
        } else if (x >= -2 && x < 4) {
            y = -(1.0 / 2) * x;
            System.out.println("y = " + y);
        } else if (x >= 4 && x < 6) {
            y = -2;
            System.out.println("y = " + y);
        } else if (x >= 6 && x <= 10) {
            y = Math.sqrt(Math.pow(r, 2) - Math.pow((8 - x), 2)) - r;
            System.out.println("y = " + y);
        } else {
            System.out.println("y не определен");
        }
    }
}