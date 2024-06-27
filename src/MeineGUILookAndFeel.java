import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeineGUILookAndFeel implements ActionListener {
    private JLabel label;
    private JButton button2, button3;
    private MeinButton button1;
    private JFrame jframe;

    public MeineGUILookAndFeel() {
        jframe = new JFrame("Button Test");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        jframe.setContentPane(panel);

        button1 = new MeinButton("MeinButton");
        button2 = new JButton("WindowsLookAndFeel");
        button3 = new JButton("MotifLookAndFeel");
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
        try {
            if (e.getSource().equals(button1)) {
                UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            } else if (e.getSource().equals(button2)) {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            } else if (e.getSource().equals(button3)) {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            }
            SwingUtilities.updateComponentTreeUI(jframe);
        } catch (Exception ex) {
        }
    }

}
