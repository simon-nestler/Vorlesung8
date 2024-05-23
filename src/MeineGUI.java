import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MeineGUI {

    public MeineGUI() {
        JFrame jframe = new JFrame("Button Test");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        jframe.setContentPane(panel);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        jframe.pack();
        jframe.setVisible(true);
    }
}
