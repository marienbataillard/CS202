import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class flag extends JPanel {
        //strip fields
       // int numberOfStripes = 13;
       // int rowsOfStars = 6;
       // int columnOfStars = 8;

    public flag() {

    }

     //input field for num of stripes, star rows and star columns. 
        //row of stars
        String rStars = JOptionPane.showInputDialog("How many rows of stars would you like?");
        int rowStars = Integer.parseInt(rStars);

        //column of stars
        String cStars = JOptionPane.showInputDialog("How many column of stars would you like?");
        int columnStars = Integer.parseInt(cStars);

        //stripesd
        String stripess = JOptionPane.showInputDialog("How many stripes would you like in your flag?");
        int stripes = Integer.parseInt(stripess);



    @Override
    public void paintComponent(Graphics g){

        //Local variables
        var w = getWidth();
        var h = getHeight();
        double stripeHeight = (double) h/stripes;
        var boxWidth = 2 * w/5;
        int boxHeight = (int) stripeHeight * 7;
        var starWidth = boxWidth/columnStars;
        var starHeight = boxHeight/rowStars;

        //background
        g.setColor(Color.red);
        g.fillRect(0, 0, w, h);

        //White Stripes
        for (int i = 1; i < stripes; i += 2) {
            g.setColor(Color.white);

            int top = (int) (i*stripeHeight);
            int bottom = (int) ((i + 1) * stripeHeight);

            g.fillRect(0, top, w, bottom - top);
        }
        //Blue box
        g.setColor(Color.blue);
        g.fillRect(0,0, boxWidth, boxHeight);
        //Stars Rows
        g.setColor(Color.white);
        int y = 0;
        for (int row = 0; row < rowStars; row++) {
            int x = 0; //resets it for each of the rows.
            for (int column = 0; column < columnStars; column++) {
                g.fillOval(x, y, starWidth, starHeight);
                x += starWidth; //moves to the next column
                }
            y += starHeight; //moves the stars down to the next row.
        }
    }

    

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600,400);
        window.setContentPane(new flag());
        window.setVisible(true);
    }
}