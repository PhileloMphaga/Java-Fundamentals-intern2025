package Chapter2.operators.Exercise;

import javax.swing.*;

/**
 * @author Philelo Mphaga
 * exercise 2.1
 */
public class RoomPrice {
    public static void main(String[] args) {
        double price = 0.0;

        // Ask for room type
        String roomType = JOptionPane.showInputDialog(
                "Choose a room type:\nA = Queen Bed\nB = King Bed\nC = King + Pullout Couch"
        );

        if (roomType != null) {
            switch (roomType.toUpperCase()) {
                case "A":
                    price = 125;
                    break;
                case "B":
                    price = 139;
                    break;
                case "C":
                    price = 165;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid room type entered!");
                    price = 0;
                    break;
            }
        }

        // Only ask for view if a valid room type was entered
        if (price > 0) {
            String viewType = JOptionPane.showInputDialog(
                    "Choose a view:\n1 = Lake View (+$15)\n2 = Park View"
            );

            if ("1".equals(viewType)) {
                price += 15;
            } else if (!"2".equals(viewType)) {
                JOptionPane.showMessageDialog(null, "Invalid view type entered!");
            }
        }

        // Show result
        JOptionPane.showMessageDialog(null, "Total price of the room: $" + price);
    }
}
