import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class BeachHutter {

    //Fields
    private Point pos;
    private Color roofColor;
    private Color wallColor;
    private int wallHeight;
    private int doorHeight;

    //Constructors
    public BeachHutter() {
        pos = new Point(0, 0);
        roofColor = Color.lightGray;
        wallColor = Color.darkGray;
    }

    public BeachHutter(int x, int y) {
        pos = new Point(x, y);
        roofColor = Color.lightGray;
        wallColor = Color.darkGray;
    }

    public BeachHutter(int x, int y, Color roofColor, Color wallColor) {
        pos = new Point(x, y);
        roofColor = Color.lightGray;
        wallColor = Color.darkGray;
        wallHeight = 50;
        doorHeight = 50;
    }

    //Methods
    public void setRoofColor(Color c){
        roofColor = c;
    }

    public void setWallColor(Color c) {
        wallColor = c;
    }

    public void setWallHeight(int h) {
        wallHeight = h;
    }

    public void setDoorHeight(int d) {
        doorHeight = d;
    }

    public void draw(Graphics g) {
        int x = pos.x;
        int y = pos.y;
        int h = wallHeight;
        int d = doorHeight;

        //BeachHut Wall
        g.setColor (wallColor);
        g.fillRect(100+x, 180+y, 150, 80 + h);

        //BeachHut Roof layer 1
        g.setColor (roofColor);
        g.fillRect(90+x, 160+y, 170, 20);
        //BeachHut Roof layer 2
        g.setColor(roofColor);
        g.fillRect(100+x, 140+y, 150, 20);
        //BeachHut Roof layer 3
        g.setColor(roofColor);
        g.fillRect(110+x, 120+y, 130, 25);

        //BeachHut Door
        g.setColor(Color.black);
        g.fillRect(190+x, 200+y, 40, 60+d);

        //BeachHut Window
        g.setColor(Color.black);
        g.fillRect(120+x, 200+y, 45, 30);

        //HUT SIGN
        //Sign Board outer
        g.setColor(new Color(124,83,55));
        g.fillRect(120+x, 140+y, 110, 30);
        //Sign Board Inner
        g.setColor(Color.white);
        g.fillRect(125+x, 145+y, 100, 20);
        //Name on board
        g.setColor(Color.black);
        g.drawString("Mars's Hut", 145+x, 160+y);
    }
}

