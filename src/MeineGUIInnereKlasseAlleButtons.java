import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeineGUIInnereKlasseAlleButtons {
    private JLabel label;

    public MeineGUIInnereKlasseAlleButtons() {
        JFrame jframe = new JFrame("Button Test");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        jframe.setContentPane(panel);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        label = new JLabel("Label");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(label);

        button1.addActionListener(new meinActionListener1());
        button2.addActionListener(new meinActionListener2());
        button3.addActionListener(new meinActionListener3());

        jframe.setSize(400, 300);
        jframe.setVisible(true);
    }

    private class meinActionListener1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Button 1");
        }
    }

    private class meinActionListener2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Button 2");
        }
    }

    private class meinActionListener3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Button 3");
        }
    }
}
