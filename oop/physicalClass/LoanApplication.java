package oop.physicalClass;

import java.util.Scanner;

public class LoanApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter ending number: ");
        int end = scanner.nextInt();

        
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
