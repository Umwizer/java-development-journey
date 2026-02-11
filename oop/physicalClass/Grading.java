//we grading student as per the following range where A is givne to those one in this range 80-100
//B from 70-79
//c from 60-69
//e from 50-59
//f fail



import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       float marks;
        System.out.print("Enter Your marks:" );
        marks = scanner.nextFloat();
        if (marks >80 && marks <=100) {
            System.out.println("Range A");
        }else if(marks >70 && marks <=79){
            System.out.println("Range B");
        }else if(marks >69 && marks <=60){
            System.out.println("Range is C");
        }else if(marks >59 && marks <=50){
            System.out.println("Range is D");
        }else{
            System.out.println("Fail");
        }


    }
}
