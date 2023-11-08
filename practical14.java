import javax.swing.*;
public class practical14 {

    practical14() {
        JFrame fr = new JFrame("Example of menu bar");
        JMenu jm = new JMenu("Menu");
        JMenuItem i1, i2, i3, i4, i5;
        JMenuBar mb=  new JMenuBar();
        JMenu sub = new JMenu("SubMenu");
        i1 = new JMenuItem("Item1");
        i2 = new JMenuItem("Item2");
        i3 = new JMenuItem("Item3");
        i4 = new JMenuItem("Item4");
        i5 = new JMenuItem("Item5");
        
        jm.add(i1);jm.add(i2); jm.add(i3);sub.add(i4);sub.add(i5);
        mb.add(jm);
        jm.add(sub);
        fr.add(mb);
        
        fr.setJMenuBar(mb);
        fr.setSize(400, 300);
        fr.setLayout(null);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new practical14();
    }

}
