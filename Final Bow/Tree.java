import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Point;

public class Tree { 
    ImageIcon img;
    Point rel;
    Point abs;

    public void setLocation(int x, int y) {
        rel = new Point(x, y);
        abs = new Point(50+x, 50+y);
    }

    public Tree(int x, int y) {
        setLocation(x, y);
        img = new ImageIcon(img.png);
    }

    public void draw(Graphics g) {
        if(abs != null);
        img.paintIcon(null, g, abs.x, abs.y);
    }
}

