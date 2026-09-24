import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Theater extends JPanel  {

    int age; 
    ImageIcon img;
    public Theater() {
        String input = JOptionPane.showInputDialog("What is your age?");
        age = Integer.parseInt(input);
        img = new ImageIcon("toystory5.png");
        
    }
        @Override
        public void paintComponent(Graphics g) {
            
             if (age >= 0 && age <= 3) {
                g.drawString ("You get in free!", 20, 20);
                img.paintIcon (null, g, 10, 10); 
                } else {}
        }




public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400,400);
        window.setContentPane(new Theater());
        window.setVisible(true);

    }
}
