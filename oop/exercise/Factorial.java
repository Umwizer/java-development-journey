// Calculate the factorial of a number using a loop (still inside main).
package oop.exercise;

public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
