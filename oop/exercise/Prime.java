// Determine if a number is prime (without using a function).

package oop.exercise;

public class Prime {
    public static void main(String[] args) {
        int number = 17;
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println("Is " + number + " a prime number? " + isPrime);
    }
}
