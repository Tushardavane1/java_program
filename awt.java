import java.awt.*;

public class awt extends Frame {
    awt() {
       Frame fr = new Frame();
        TextField firstNameTF = new TextField();  
        fr.setLayout(new FlowLayout());
        firstNameTF.setBounds(120, 50, 100, 20); 

        fr.add(firstNameTF);

       fr. setVisible(true);
       fr.setLayout(null);
        fr.setSize(300, 400);
    }

    public static void main(String[] args) {
        new awt();
    }
}