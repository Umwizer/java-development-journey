import java.util.Scanner;
public class Calc{
    public void Add (){
        int a,b,sum;
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = input.nextInt();
        System.out.println("Enter second number: ");
        b = input.nextInt();
        sum = a + b;
        System.out.println("Sum is: " + sum);
    }
}