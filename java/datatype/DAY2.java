package datatype;
import java.util.Scanner;

public class DAY2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, sum, difference, product, quot;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        sum = number1 + number2;
        difference = number1 - number2;
        product = number1 * number2;

        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Difference: %d%n", difference);
        System.out.printf("Product: %d%n", product);

        if (number2 != 0) {
            quot = number1 / number2;
            System.out.printf("Quotient: %d%n", quot);
        } else {
            System.out.println("Cannot divide by zero!");
        }

        input.close();
    }
}

