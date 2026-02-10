

package java.datatype;
//calculator class
import java.util.Scanner;
public class Calc{
    public void simpleCalculator(){
        float a,b,sum,diff,prod,quot;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number \t:" );
        a=input.nextFloat();
        System.out.println("Enter second number \t:");
        b=input.nextFloat();
        sum=a+b;
        diff=a-b;
        prod=a*b;
        quot=a/b;
        System.out.println("Sum is: " + sum);
        System.out.println("Difference is: " + diff);
        System.out.println("Product is: " + prod);
        System.out.println("Quotient is: " + quot);
    }
    public static void main(String[] args) {
        Calc c = new Calc();   
        c.simpleCalculator(); 
    }
}