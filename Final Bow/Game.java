import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Game extends JPanel { 
    ArrayList <Tree> forest;
    int cols, rows;

    public Game() {
        kepu = new Tree(2,1);
        karl = new Tree(1,3);
        cols = 7;
        rows = 7;
    }

    @Override 
    public void paintComponent(Graphics g) {
        g.drawRect(10, 10, cols*50, rows*50);
        //draws the trees
    }

}