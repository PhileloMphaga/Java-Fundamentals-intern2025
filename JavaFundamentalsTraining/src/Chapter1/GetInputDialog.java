package Chapter1;

import javax.swing.*;

/**
 * Documentation comment
 * @author philelo Mphaga
 * This class demonstrate how to get input from the user
 * using a dialog input box
 *
 */
public class GetInputDialog {
    public static void main(String[] args) {
        int age;
        double height;
        float salary;
        boolean isMarried = false;
        char initial;
        String firstname;

        firstname = JOptionPane.showInputDialog("Please enter your name");
        initial = firstname.charAt(0);
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter age"));
        height = Double.parseDouble(JOptionPane.showInputDialog("Enter height"));
        salary = Float.parseFloat(JOptionPane.showInputDialog("Enter salary"));

        String output = String.format("""
                Name: %s (%s)
                Age: %d
                Height: %.2f
                Salary: %.2f
                Married?: %b""",
                firstname, initial, age, height, salary, isMarried);

        JOptionPane.showMessageDialog(null, output);
    }
}
