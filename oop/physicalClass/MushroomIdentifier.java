package oop.physicalClass;

import java.util.Scanner;

public class MushroomIdentifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Does your mushroom have gills? (yes/no): ");
        String gills = scanner.next();

        if (gills.equalsIgnoreCase("no")) {
            System.out.println("Your mushroom is: Cepe de Bordeaux");
        } else {
            System.out.print("Does your mushroom grow in a forest? (yes/no): ");
            String forest = scanner.next();

            if (forest.equalsIgnoreCase("no")) {
                System.out.print("Does your mushroom have a ring? (yes/no): ");
                String ring = scanner.next();

                if (ring.equalsIgnoreCase("yes")) {
                    System.out.println("Your mushroom is: Coprin chevelu");
                } else {
                    System.out.println("Your mushroom is: Agaric jaunissant");
                }
            } else {
                System.out.print("Does your mushroom have a convex cup? (yes/no): ");
                String cup = scanner.next();

                if (cup.equalsIgnoreCase("yes")) {
                    System.out.print("Does your mushroom have a ring? (yes/no): ");
                    String ring = scanner.next();

                    if (ring.equalsIgnoreCase("yes")) {
                        System.out.println("Your mushroom is: Amanite tue-mouche");
                    } else {
                        System.out.println("Your mushroom is: Pied bleu");
                    }
                } else {
                    System.out.println("Your mushroom is: Girolle");
                }
            }
        }

        scanner.close();
    }
}
