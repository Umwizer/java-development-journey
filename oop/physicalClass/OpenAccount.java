package oop.physicalClass;

import java.util.Scanner;

public class OpenAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number :");
        int a = scanner.nextInt();
        System.out.print("Enter second number :");
        int b = scanner.nextInt();
        if (a>b) {
            System.out.println("Invalid input");
        }else{
             for (int i = a; i <= b; i+=3) {
                if (i<100) {
                    System.out.println(i);
                }
            
        } 
        }
       
    }
}
