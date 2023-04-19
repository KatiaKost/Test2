import java.util.Scanner;

public class CalculationOfYAxis_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double y;
        System.out.print("Введите х: ");
        double x = input.nextDouble();
        System.out.print("Введите Радиус: ");
        double r = input.nextDouble();

        if (x >= -10 && x < -8) {
            y = -r;
            System.out.println("y = " + y);
        } else if (x >= -8 && x < -3) {
            y = (3 * x / 5) + 1.8;
            System.out.println("y = " + y);
        } else if (x >= -3 && x < 3) {
            y = -(Math.sqrt((Math.pow(r, 2)) - Math.pow(x, 2)));
            System.out.println("y = " + y);
        } else if (x >= 3 && x < 5) {
            y = x - 3;
            System.out.println("y = " + y);
        } else if (x >= 5 && x < 8) {
            y = 3;
            System.out.println("y = " + y);
        } else System.out.println("у не определен");

    }
}