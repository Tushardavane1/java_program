import java.awt.*;
import javax.swing.*;
public class swing2  {   
    public static void main(String[] args) {
        JFrame fr = new JFrame("Example of button");
        fr.setLayout(new FlowLayout());
        JButton button = new JButton("Click Me");
      button.setPreferredSize(new Dimension(70, 50));

      JTextField text = new JTextField("CLicked button");
      fr.add(text);
        

        fr.add(button);

        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        fr.setSize(500, 450);
    }
    
}
