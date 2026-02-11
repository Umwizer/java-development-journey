//employees  are having different where by the loan range depend on their salary range
//500k-100k he is getting 12 times his salary on 3%
//below 500k he is getting 10 times but on 5%
//above 1000k - 2000k he is geetting 15 times but on 2%
//above 2000k 
package oop.physicalClass;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        double salary;
        double loan;
        Scanner sc = new Scanner(System.in);
        salary=sc.nextDouble();
        System.out.println("enter your salary amount");
        if (salary > 100000) {
            loan=salary*15;
            System.out.println("loan allowed is " +loan);
        }else if(salary >=50000 && salary <=100000){
            loan=salary*12;
            System.out.println("loan allowed is " +loan);
        }else if(salary < 50000 && salary > 0){
            loan=salary*10;
            System.out.println("loan allowed is " +loan);
        }else{
            System.out.println("Invalid salary");
        }
    }
}
