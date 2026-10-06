import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class flag extends JPanel {
    public flag() {

    }
//strip fields
        int numberOfStripes = 13;
        int rowsOfStars = 6;
        int columnOfStars = 8;

    @Override
    public void paintComponent(Graphics g){

//Local variables
        var w = getWidth();
        var h = getHeight();
        var stripeHeight = h/numberOfStripes;
        var boxWidth = 2 * w/5;
        var boxHeight = stripeHeight * 7;
        var starWidth = boxWidth/columnOfStars;
        var starHeight = boxHeight/rowsOfStars;

//background
        g.setColor(Color.red);
        g.fillRect(0, 0, w, h);

//White Stripes
        for (int i = 1; i < numberOfStripes; i += 2) {
            g.setColor(Color.white);
            g.fillRect(0, (int)(i * stripeHeight),
                getWidth(), (int)stripeHeight);
        }
//Blue box
        g.setColor(Color.blue);
        g.fillRect(0,0, boxWidth, boxHeight);
//Stars Rows
        g.setColor(Color.white);
        int y = 0;
        for (int row = 0; row < rowsOfStars; row++) {
            int x = 0; //resets it for each of the rows.
            for (int column = 0; column < columnOfStars; column++) {
                g.fillOval(x, y, starWidth, starHeight);
                x += starWidth; //moves to the next column
        }

        y += starHeight; //moves the stars down to the next row.
        }
        }
//adding test.
    }

void main () {
    var window = new JFrame();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setSize(600,400);
    window.setContentPane(new flag());
    window.setVisible(true);
}