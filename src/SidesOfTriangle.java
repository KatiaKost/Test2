import java.util.Scanner;

public class SidesOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое положительное число: ");
        double firstNumber = input.nextDouble();
        System.out.print("Введите второе положительное число: ");
        double secondNumber = input.nextDouble();
        System.out.print("Введите третье положительное число: ");
        double thirdNumber = input.nextDouble();
        boolean conditionCheck;

        if (firstNumber >= secondNumber + thirdNumber || secondNumber >= firstNumber + thirdNumber
                || thirdNumber >= firstNumber + secondNumber) {
            conditionCheck = false;
        } else conditionCheck = true;
        if (conditionCheck == false) {
            System.out.println("Третья сторона больше либо равна сумме двух других сторон");
        } else System.out.println("Третья сторона меньше суммы двух других сторон");
    }
}