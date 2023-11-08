import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator_Gui {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorFrame frame = new CalculatorFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class CalculatorFrame extends JFrame {
    private JTextField display;

    public CalculatorFrame() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (command.equals("=")) {
                // Calculate and display the result
                try {
                    String expression = display.getText();
                    double result = calculate(expression);
                    display.setText(Double.toString(result));
                } catch (Exception ex) {
                    display.setText("Error");
                }
            } else if (command.equals("C")) {
                // Clear the display
                display.setText("");
            } else {
                // Append the clicked button's label to the display
                display.setText(display.getText() + command);
            }
        }

        private double calculate(String expression) {
            // Add your custom calculation logic here
            try {
                return new Parser(expression).parse();
            } catch (Exception e) {
                throw new RuntimeException("Invalid expression");
            }
        }
    }
}

class Parser {
    private final String expression;

    public Parser(String expression) {
        this.expression = expression;
    }

    public double parse() {
        // You can implement your own parsing and calculation logic here
        // For simplicity, we'll use a basic parser for demonstration purposes
        return evaluateExpression(expression);
    }

    private double evaluateExpression(String expression) {
        // Implement a more sophisticated expression evaluation algorithm here
        return Double.parseDouble(expression);
    }
}