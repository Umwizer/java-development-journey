

import java.util.Scanner;

public class BicycleRental {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter starting hour (0-23): ");
        int start = scanner.nextInt();

        System.out.println("Enter ending hour (1-24): ");
        int end = scanner.nextInt();

        int totalCost = 0;

        for (int hour = start; hour < end; hour++) {
            if ((hour >= 0 && hour < 7) || (hour >= 21 && hour < 24)) {
                totalCost += 500;
            } else if ((hour >= 7 && hour < 14) || (hour >= 19 && hour < 21)) {
                totalCost += 1000;
            } else if (hour >= 14 && hour < 19) {
                totalCost += 1500;
            } else {
                System.out.println("Invalid hour: " + hour);
            }
        }

        System.out.println("Total rental cost: " + totalCost + " RWF");
        scanner.close();
    }
}





