import java.util.Scanner;

public class FunctionValueCalculation_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите x: ");
        double x = input.nextDouble();
        double a = 5.7;
        double b = 6.4;
        double c = 3.1;

        double y = ((Math.sqrt(Math.exp(a * x) + Math.pow(x, 2))) * Math.log(Math.pow(x, 2) + b * x + 10)) / (Math.sin(c * x) + 4.2);
        System.out.println("y = " + y);
    }
}
