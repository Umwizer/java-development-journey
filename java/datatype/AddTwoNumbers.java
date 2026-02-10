package java.datatype;

import java.util.Scanner;
public class AddTwoNumbers {
    public static void main(String[] args) {
        double a,b;
        if (args.length >=2) {
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[1]);
        }else{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number:");
            a = sc.nextDouble();
            System.out.println("Enter second number:");
            b = sc.nextDouble();
            sc.close();
        }
        System.out.println("Sum of " + a + " and " + b + " is: " + (a+b));
        System.out.println("Difference:" + (a-b));
        System.out.println("Product:"+ (a*b));
        System.out.println(b!=0 ? "Quotient:" + (a/b): "Cannot divide by zero");
    }
}
