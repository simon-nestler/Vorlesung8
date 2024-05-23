import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeineGUIAnonymeInnereKlasseAlleButtons {
    private JLabel label;

    public MeineGUIAnonymeInnereKlasseAlleButtons() {
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

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button 1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button 2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button 3");
            }
        });

        jframe.setSize(400, 300);
        jframe.setVisible(true);
    }
}
