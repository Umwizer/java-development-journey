

import java.util.Scanner;
public class Age {
   
    public static void main(String[] args) {

         int age;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age");
        age=scanner.nextInt();
        if (age>=16 && age <=100) {
            System.out.println("You are allowed");
        }else if(age<16 && age>0){
            System.out.println("You are not allowed");
        }else{
            System.out.println("Invalid age");
        }
    }
}
