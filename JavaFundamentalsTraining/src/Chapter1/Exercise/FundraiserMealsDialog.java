package Chapter1.Exercise;

import javax.swing.*;
import java.text.DecimalFormat;

/**
 * Documentation comment
 * @author philelo Mphaga
 * This is exercise for showing total money collected
 * using a dialog input box
 *
 */
public class FundraiserMealsDialog {
    public static void main(String[] args) {
        // Prices
        final double ADULT_MEAL_PRICE = 50.00;
        final double CHILD_MEAL_PRICE = 37.50;

        DecimalFormat formatter = new DecimalFormat("0.00");

        // Input dialogs
        int adultMeals = Integer.parseInt(
                JOptionPane.showInputDialog("Enter number of adult meals sold:")
        );

        int childMeals = Integer.parseInt(
                JOptionPane.showInputDialog("Enter number of child meals sold:")
        );

        // Calculations
        double adultTotal = adultMeals * ADULT_MEAL_PRICE;
        double childTotal = childMeals * CHILD_MEAL_PRICE;
        double grandTotal = adultTotal + childTotal;

        // Build output message
        String output = String.format(
                "===== Fundraiser Totals =====\n" +
                        "Adult meals sold: %d (R%s)\n" +
                        "Child meals sold: %d (R%s)\n" +
                        "------------------------------\n" +
                        "Overall total: R%s",
                adultMeals, formatter.format(adultTotal),
                childMeals, formatter.format(childTotal),
                formatter.format(grandTotal)
        );

        // Show result
        JOptionPane.showMessageDialog(null, output);
    }
}
