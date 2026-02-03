package java.datatype;
import java.util.Scanner;
// add two numbers using Java

public class Add{
     public static void main (String[] args){
        int a,b,sum;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter first number: ");
            a = input.nextInt();
            System.out.println("Enter second number: ");
            b = input.nextInt();
            sum = a + b;
            System.out.println("Sum is: " + sum);
        }
     }
     }
