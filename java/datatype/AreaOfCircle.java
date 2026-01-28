package java.datatype;

import java.util.Scanner;
public class AreaOfCircle {
    
    public static double calculateArea(double radius){
    System.out.println("Enter radius of circle:");
    return Math.PI * radius * radius;
    }
    public static double CalculateVolumeCyclinder (double radius, double height){
        double baseArea = calculateArea(radius);
        return baseArea *height * Math.PI;
    }


public static void main(String[] args){
    try (Scanner input = new Scanner(System.in)) {
        System.out.println("Enter radius:");
        double radius = input.nextDouble();
        double area = calculateArea(radius);
        System.out.println("Area of circle is: " + area);
        System.out.println("Enter height of cylinder:");
        double height = input.nextDouble();
        double volume = CalculateVolumeCyclinder(radius, height);
        System.out.println("Volume of cylinder is: " + volume);
    }

}
}