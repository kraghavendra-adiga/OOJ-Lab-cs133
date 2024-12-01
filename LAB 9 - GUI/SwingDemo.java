package Lab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingDemo {
    SwingDemo() {
        // Create JFrame container
        JFrame jfrm = new JFrame("Divider App");
        jfrm.setSize(275, 200); // Increased size to accommodate the result labels properly
        jfrm.setLayout(new FlowLayout());

        // Terminate on close
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Text label for instructions
        JLabel jlab = new JLabel("Enter the divider and dividend:");

        // Add text fields for both numbers (divider and dividend)
        JTextField ajtf = new JTextField(8);
        JTextField bjtf = new JTextField(8);

        // Button to perform the calculation
        JButton button = new JButton("Calculate");

        // Labels to display error and results
        JLabel err = new JLabel();
        JLabel alab = new JLabel();
        JLabel blab = new JLabel();
        JLabel anslab = new JLabel();

        // Add components to the JFrame in order
        jfrm.add(err);  // To display error messages
        jfrm.add(jlab); // Instruction label
        jfrm.add(ajtf); // Text field for divider
        jfrm.add(bjtf); // Text field for dividend
        jfrm.add(button); // Calculate button
        jfrm.add(alab);  // Result for A
        jfrm.add(blab);  // Result for B
        jfrm.add(anslab); // Result for answer

        // Action listener for the Calculate button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    // Parse input from the text fields
                    int a = Integer.parseInt(ajtf.getText());
                    int b = Integer.parseInt(bjtf.getText());

                    // Perform division and display results
                    int ans = a / b;

                    // Set the labels to show the values of A, B, and the result
                    alab.setText("A = " + a);
                    blab.setText("B = " + b);
                    anslab.setText("Ans = " + ans);
                    err.setText(""); // Clear any previous error message
                } catch (NumberFormatException e) {
                    // Handle invalid number format input (e.g., non-integer input)
                    alab.setText("");
                    blab.setText("");
                    anslab.setText("");
                    err.setText("Enter Only Integers!");
                } catch (ArithmeticException e) {
                    // Handle division by zero
                    alab.setText("");
                    blab.setText("");
                    anslab.setText("");
                    err.setText("B should be NON zero!");
                }
            }
        });

        // Display the frame
        jfrm.setVisible(true);
    }

    public static void main(String args[]) {
        // Create frame on event dispatching thread
        System.out.println("Name: K Raghavendra S Adiga");
        System.out.println("USN: 1BM23CS133");
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }
}
