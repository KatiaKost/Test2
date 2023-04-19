import java.util.Scanner;

public class Calculation_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите а: ");
        double a = input.nextDouble();

        double z1 = 1 - ((1.0 / 4) * Math.pow(Math.sin(2 * a), 2)) + Math.cos(2 * a);
        double z2 = Math.pow(Math.cos(a), 2) + Math.pow(Math.cos(a), 4);

        System.out.println("z1 = " + z1);
        System.out.println("z2 = " + z2);
    }
}