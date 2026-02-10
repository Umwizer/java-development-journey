// Calculate the sum, difference, product, quotient, and remainder
// of two integers entered by the user.
package oop.exercise;

import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the 1 number ");
        int n = scanner.nextInt();

        System.out.println("Enter the 2 number ");
        int m = scanner.nextInt();

        int sum = n + m;
        double average = sum / 2.0;
        double product = n * m;
        double quoetient = n/m;
        double remainder = n % m;
        System.out.println("The sum of " + n + " and " + m + " is: " + sum);
        System.out.println("The average of " + n + " and " + m + " is:" + average);
        System.out.println("The product of " + n + " and " + m + " is: " + product);
        System.out.println("The quoetient of " + n + " and " + m + " is: " + quoetient);
        System.out.println("The remainder of " + n + " and " + m + " is: " + remainder);
    }   
}
