import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class meinActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button wurde gedrückt");
    }
}
