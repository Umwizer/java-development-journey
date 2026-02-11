package oop.physicalClass;

import java.util.Scanner;

public class OverDraft {
    //while loop syntax 
    //while(condition){
    //statements
    //}
    public static void main(String[] args) {
        int a=1;
        int b=10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        a=scanner.nextInt();
        System.out.println("Enter Second Number");
        b=scanner.nextInt();
        if (a>b) {
            System.out.println("A should be less than b");
        }else{
            while (a<=b) {
            System.out.println(a);
            a++;
        }
        }
       
    }
}
