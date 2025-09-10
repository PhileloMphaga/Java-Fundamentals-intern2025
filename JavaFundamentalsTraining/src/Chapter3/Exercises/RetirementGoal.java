package Chapter3.Exercises;

import javax.swing.*;

/**
 * @author Philelo Mphaga
 * Exercise chapter 3
 */
public class RetirementGoal {
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
            String a = JOptionPane.showInputDialog("Enter amount you can save per year (> 0):");
            if (a == null) return;
            try {
                annual = Double.parseDouble(a.trim());
                if (annual > 0) break;
                JOptionPane.showMessageDialog(null, "Annual saving must be a positive number.");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number for annual saving.");
            }
        }

        // No interest assumed
        double total = years * annual;

        String msg = String.format("""
                ===== Retirement Goal =====
                Years until retirement: %d
                Amount saved per year:  R%.2f
                ------------------------------
                Total at retirement:   R%.2f
                """, years, annual, total);

        JOptionPane.showMessageDialog(null, msg);
    }

}
