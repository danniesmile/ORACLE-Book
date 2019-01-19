package oraclebook;

public class GalToLitTable {
    public static void main(String[] args) {

        /* Try this 1-2

        This program displays a conversion table of gallons to liters.

         */

        double gallons, liters;
        int counter;

        counter = 0; // Line counter is initially set to zero

        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; // Convert to liters
            System.out.println(gallons + " gallons is " +
                    liters + " liters.");
            counter++; // Increment the line counter with each loop iteration

            // Every 10th line, print a blank line
            if (counter == 10) {
                System.out.println();
                counter = 0; // Reset the line counter
            }
        }
    }
}
