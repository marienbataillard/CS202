import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Rexzina extends JPanel {


    public static void main(String [] args) {
       //create a new window
        var window = new JFrame(); 
       
       //set the window to be 200 pixels wide, 200 pixels high
        window.setSize(300,300);
       

       //close the app when the user closes the window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       /*make the Windows class responsible for the contents
       of our window */
        window.setContentPane(new Rexzina());

        window.setVisible(true);
    }

    @Override
    public void paintComponent (Graphics g) {
        g.drawString("CS202 is Rexzina's favorite class!", 20, 20);
        g.drawString("This is a new line", 20, 30);
    }
}