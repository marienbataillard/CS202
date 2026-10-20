import java.awt.*;

public class LittlePrince {
    Point location;
    Color bowtie;

    public LittlePrince() {
        location = new Point();
        bowtie = Color.RED;
    }

     public LittlePrince(int x, int y) {
        location = new Point(x,y);
        bowtie = Color.RED;
    }

     public LittlePrince(int x, int y, Color bt) {
        location = new Point(x, y);
        bowtie = bt;
    }



    public void talk(){
        IO.println("Bonjour! I am the little prince!");
    }

    public void moveTo(int x, int y) {
        location.x = x;
        location.y = y;

    }

    public void moveBy(int x, int y) {
        location.x += x;
        location.y += y;
    }

    public void draw(Graphics g) {
        //TODO add instructions to draw the little prince
        //draw the little prince's head
        g.setColor(new Color(189,153,119));
        g.fillOval(175+location.x,75+location.y,50,50);

        //draw the little prince's clothes
        g.setColor(Color.GREEN);
        g.fillRect(175+location.x,location.y+125,50,100);
        g.fillRect(175+location.x,225+location.y,20,60);
        g.fillRect(205+location.x,225+location.y,20,60);

        //draw the little prince's bow-tie
        g.setColor(Color.RED);
        g.fillOval(191+location.x,117+location.y,10,15);
        g.fillOval(199+location.x,117+location.y,10,15);
    }
}
