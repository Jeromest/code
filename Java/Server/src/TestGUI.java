import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("´°¿Ú");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(null);
        JLabel l = new JLabel("Hello World!");
        //ÎÄ×ÖÑÕÉ«
        l.setForeground(Color.red);
        l.setBounds(50, 50, 280, 30);

        f.add(l);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}