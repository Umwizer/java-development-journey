// Find the greatest of three numbers using nested if statements.
package oop.exercise;
import java.util.Scanner;
public class Greatest {
   public static void main(String[] args) {
      int a,b,c;
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter first number: ");
      a = scanner.nextInt();
      System.out.print("Enter second number: ");
      b = scanner.nextInt();
      System.out.print("Enter third number: ");
      c = scanner.nextInt();

      if (a > b && a>c) {
        System.out.print("A is greatest number :" + a);
      }
      else if(b>a && b>c){
        System.out.print("B is greatest number : " + b);
      }else{
        System.out.println("C is greatest  : " + c);
      }

   } 
}
