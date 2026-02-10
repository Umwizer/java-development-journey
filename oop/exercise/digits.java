// Find the sum of digits of a number
package oop.exercise;

public class digits {
    public static void main(String[] args) {
        int number = 23;
        int sumOfDigits = 0;
        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit; // Add it to the sum
            number /= 10; 

        }
        System.out.println("The sum of the digits is: " + sumOfDigits);
    }
}
