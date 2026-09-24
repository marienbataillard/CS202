import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class Theater extends JPanel {

    public Theater() {
        String input = JOptionPane.showInputDialog("What is your age?");
    }
        @Override
        public void paintComponent(Graphics g) {
            //You custom rendering code
        }

}



public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400,400);
        window.setContentPane(new Theater());
        window.setVisible(true);

    }