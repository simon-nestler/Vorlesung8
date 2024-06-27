import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeineGUIEreignisseZentralisiertVerarbeiten implements ActionListener {
    private JLabel label;
    private JButton button1, button2, button3;

    public MeineGUIEreignisseZentralisiertVerarbeiten() {
        JFrame jframe = new JFrame("Button Test");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        jframe.setContentPane(panel);

        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");
        label = new JLabel("Label");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(label);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        jframe.setSize(400, 300);
        jframe.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(button1)) {
            label.setText("Button 1");
        } else if (e.getSource().equals(button2)) {
            label.setText("Button 2");
        } else if (e.getSource().equals(button3)) {
            label.setText("Button 3");
        }
    }

}
