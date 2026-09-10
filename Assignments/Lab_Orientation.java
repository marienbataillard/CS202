import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Lab_Orientation extends JPanel{

    public static void main(String [] args) {
        var window = new JFrame();
        window.setSize(600, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new Lab_Orientation());
        window.setVisible(true);
    }

    @Override
    public void paintComponent (Graphics g) {
        var w = getWidth();
        var h = getHeight();
        g.fillRect(0,0,w,h);
        g.setColor(Color.MAGENTA);
   
        g.drawString("What fruit did Adam and Eve eat when they were sent out of the Garden of Eden?", 20, 20);
        g.drawString("A Mango.", 20 , 40);
        g.drawString("Man eat! Man-go!", 20, 60);
        
    }
}