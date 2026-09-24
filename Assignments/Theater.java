import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Theater extends JPanel  {

    int age; 
    int id;
    ImageIcon toystory;
    ImageIcon moana;
    ImageIcon grogu;
    ImageIcon daisy;
    public Theater() {
        String input = JOptionPane.showInputDialog("What is your age?");
        age = Integer.parseInt(input);
        toystory = new ImageIcon("toystory5.jpg");
        moana = new ImageIcon("moana2026.jpg");
        grogu = new ImageIcon("grogu.jpg");
        daisy = new ImageIcon("Daisy.jpeg");

        id = JOptionPane.showConfirmDialog(null, "Do you have a student or military ID?", "ID Discount", JOptionPane.YES_NO_OPTION);


    }
        @Override
        public void paintComponent(Graphics g) {
            
             if (age >= 0 && age < 3) {
                g.drawString ("You get in free!", 20, 280);
                toystory.paintIcon (null, g, 10, 10); 
                } 
            else if (age >= 3 && age <=11) {
                g.drawString ("You owe $7.00", 20, 280);
                moana.paintIcon(null, g, 10, 10);
            }
            else if (age > 11 && age < 60 && id == JOptionPane.NO_OPTION) {
                g.drawString("You owe $10.00!", 20, 280);
                grogu.paintIcon(null, g, 20, 20);
            }
            else if (age >= 60 && age < 120) {
                g.drawString("That will be $7:00", 20, 280);
                daisy.paintIcon(null, g, 20, 20);
            } 
            else if (age < 0 || age >= 120) {
                g.drawString("Are you sure you typed that correctly?", 20, 50);
            } 
            else if (id == JOptionPane.YES_OPTION && age > 11 && age < 60) {
                g.drawString("You owe $8.00!", 20, 280);
                grogu.paintIcon(null, g, 20, 20);
            }
        
        }




public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400,400);
        window.setContentPane(new Theater());
        window.setVisible(true);

    }
}
