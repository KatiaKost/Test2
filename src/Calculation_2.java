import java.util.Scanner;

public class Calculation_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите а: ");
        double a = input.nextDouble();

        double z1 = Math.cos(a) + Math.sin(a) + Math.cos(3 * a) + Math.sin(3 * a);
        double z2 = 2 * Math.sqrt(2) * Math.cos(a) * Math.sin((Math.PI / 4) + 2 * a);

        System.out.println("z1 = " + z1);
        System.out.println("z2 = " + z2);
    }
}
