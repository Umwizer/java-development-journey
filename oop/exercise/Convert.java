// Convert days into years, months, and days (assume 365
// days/year, 30 days/month).
package oop.exercise;

public class Convert {
    public static void main(String[] args) {
        int totalDays = 400;
        int years = totalDays / 365;
        int remainingDaysAfterYears = totalDays % 365;
        int months = remainingDaysAfterYears / 30;
        int days = remainingDaysAfterYears % 30;

        System.out.println(totalDays + " days is approximately " + years + " years, " + months + " months, and " + days + " days.");
    }
}
