import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;

        System.out.println("Addition = " + add);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + mul);

        if (num2 != 0) {
            int div = num1 / num2;
            System.out.println("Division = " + div);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        input.close();
    }
}