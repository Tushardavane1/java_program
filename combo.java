import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class combo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("T.Y.BSc Subject List");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 150);
            frame.setLayout(new GridLayout(3, 1));

            JComboBox<String> subjectComboBox = new JComboBox<>(new String[]{
                    "Physics", "Chemistry", "Mathematics", "Biology", "Computer Science", "Geology", "Statistics"
            });

            JTextField selectedSubjectTextField = new JTextField();
            selectedSubjectTextField.setEditable(false);

            JButton showSubjectButton = new JButton("Show Selected Subject");

            frame.add(subjectComboBox);
            frame.add(showSubjectButton);
            frame.add(selectedSubjectTextField);

            showSubjectButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String selectedSubject = (String) subjectComboBox.getSelectedItem();
                    selectedSubjectTextField.setText("Selected Subject: " + selectedSubject);
                }
            });

            frame.setVisible(true);
        });
    }
}

