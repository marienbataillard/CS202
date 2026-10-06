import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;

public class flag extends JPanel {
    public flag() {

    }
//strip fields
        int numberOfStrips = 13;
        int rowsOfStars = 6;
        int columnOfStars = 8;


    @Override
    public void paintComponent(Graphics g){

//Local variables
        w = getWidth();
        h = getHeight();
        stripeHeight = h/numberOfStripes;
        boxWidth = 2 * w/s;
        boxHeight = StripeHeight + 7;
        starWidth = boxWidth/columnOfStars;
        starHeight = boxHeight/rowsOfStars;

//Stars
        g.setColor(Color.white);
        g.fillRext(w,h)
        x = 0
        y = 0

        



    }

void main () {
    var window = new JFrame();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setSize(400,400);
    window.setContentPane(new flag());
    window.setVisible(true);
}
}
