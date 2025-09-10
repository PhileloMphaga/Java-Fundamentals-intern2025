package Chapter3.Homework;

import javax.swing.*;

/**
 * @author Philelo Mphaga
 * adding annual increase of 10%
 */
public class RetirementGoalEnhancement {
    public static void main(String[] args) {

        int years = 0;
        double annual = 0.0;

        // Get valid years
        while (true) {
            String y = JOptionPane.showInputDialog("Enter number of years until retirement (> 0):");
            if (y == null) return;
            try {
                years = Integer.parseInt(y.trim());
                if (years > 0) break;
                JOptionPane.showMessageDialog(null, "Years must be a positive whole number starting from 1.");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid whole number for years.");
            }
        }

        // Get valid annual amount (> 0)
        while (true) {
            String a = JOptionPane.showInputDialog("Enter amount you can save in the first year (> 0):");
            if (a == null) return;
            try {
                annual = Double.parseDouble(a.trim());
                if (annual > 0) break;
                JOptionPane.showMessageDialog(null, "Annual saving must be a positive number.");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number for annual saving.");
            }
        }

        // Now calculate savings with 10% growth each year
        double total = 0.0;
        StringBuilder breakdown = new StringBuilder("===== Savings Breakdown =====\n");

        for (int i = 1; i <= years; i++) {
            breakdown.append(String.format("Year %d: R%.2f\n", i, annual));
            total += annual;

            // From year 2 onwards, increase annual by 10% of previous
            annual += annual * 0.10;
        }

        breakdown.append("------------------------------\n")
                .append(String.format("Total at retirement: R%.2f", total));

        // Show the full breakdown
        JOptionPane.showMessageDialog(null, breakdown.toString());
    }
}
