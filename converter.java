import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class converter {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Celsius to Fahrenheit Converter");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 150);
            frame.setLayout(new GridLayout(2, 2));

            JLabel celsiusLabel = new JLabel("Enter Celsius: ");
            JTextField celsiusField = new JTextField();
            JLabel resultLabel = new JLabel("Fahrenheit: ");
            JTextField resultField = new JTextField();
            resultField.setEditable(false);

            JButton convertButton = new JButton("Convert");

            frame.add(celsiusLabel);
            frame.add(celsiusField);
            frame.add(resultLabel);
            frame.add(resultField);
            frame.add(convertButton);

            convertButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        double celsius = Double.parseDouble(celsiusField.getText());
                        double fahrenheit = (celsius * 9 / 5) + 32;
                        resultField.setText(String.format("%.2f", fahrenheit));
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Invalid input. Please enter a valid number.");
                    }
                }
            });

            frame.setVisible(true);
        });
    }
}

