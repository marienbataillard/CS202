import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class AsteroidB6122 extends JPanel {

    LittlePrince mars;
    LittlePrince vinay;
    //vinay.moveBy(-100,0);
    //vinay.bowtie = Color.BLACK; 

    public AsteroidB6122() {
    //Your custom initialization code here
    mars = new LittlePrince();
    vinay = new LittlePrince(-100, 0, Color.BLACK);
    }

    @Override
    public void paintComponent(Graphics g) {
        //draw the infinite inky blackness of outer space
        g.setColor(Color.BLACK);
        g.fillRect(0,0,400,400);

        //draw the top part of asteroid B-612
        g.setColor(Color.GRAY);
        g.fillOval(-200, 200, 800, 800);

        //drawLittlePrince(g, -50, 0);
        //drawLittlePrince(g, 50, 50, Color.BLUE);
        mars.draw(g);

        //if (sheepChoice.equals("y")) { 
        // sheep.paintIcon(null, g, 200, 150); }
        /*g.setColor(Color.WHITE);
        if (dy < 0) {
        g.drawString("Defying gravity!!", 20, 20);
        }
        else {
        g.drawString("Safely on the ground.", 20, 20);
        }*/
    }

    void main() {
    var window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400,400);
        window.setContentPane(new AsteroidB6122());
        window.setVisible(true);
    }
}