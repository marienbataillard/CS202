import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PracticeLoops extends JPanel {

    String[] witnesses;

    public PracticeLoops() {
        witnesses = new String[3];
        witnesses[0] = "Oliver Cowdery";
        witnesses[1] = "David Whitmer";
        witnesses[2] = "Someone Else";
    }
    @Override
    public void paintComponent(Graphics g) {
        int x = 10;
        int y = 20;
        for (var w: witnesses) {
            g.drawString(w, x, y);
            y += 20;
        }
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400,400);
        window.setContentPane(new PracticeLoops());
        window.setVisible(true);

    }
}