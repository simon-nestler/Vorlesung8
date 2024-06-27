import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JButton;

public class MeinButton extends JButton {

    public MeinButton(String text) {
        super(text);
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(this.getBackground());
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.black);

        Graphics2D g2d = (Graphics2D) g;
        // rechteck mit farbverlauf
        GradientPaint gradient = new GradientPaint(50, 0, Color.black, 50, 30, Color.white);
        g2d.setPaint(gradient);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        g.drawString(this.getText(), 5, 20);
        // super.paintComponent(g);

    }
}
