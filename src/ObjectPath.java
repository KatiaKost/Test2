import java.util.Scanner;

public class ObjectPath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double g = 9.80665;
        System.out.print("Введите x0: ");
        double x0 = input.nextDouble();
        System.out.print("Введите v0: ");
        double v0 = input.nextDouble();
        System.out.print("Введите t: ");
        double t = input.nextDouble();

        double S = x0 + v0 * t - ((g * Math.pow(t, 2)) / 2);
        System.out.println("S = " + S + "м.");
    }
}
