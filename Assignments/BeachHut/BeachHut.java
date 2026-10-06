import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BeachHut extends JPanel {
    public BeachHut() {

    }

    @Override
    public void paintComponent(Graphics g){

//BeachHut adjuster to float
        var dx = 0;
        var dy = -50;
//Cloud#2 duplicate adjuster
        var cx = 100;
        var cy = -30;
//Cloud#3 adjuster
        var ccx = 200;
        var ccy = 20;

//background sky
        g.setColor(new Color(80,140,146));
        var w = getWidth();
        var h = getHeight();
        g.fillRect(0, 0, w, h);

//mountain 1
        g.setColor(new Color(124,83,55));
        int[] xPoints = { 250, -100, -50};
        int[] yPoints = { 250, 250, 100};
        int nPoints = 3;
        g.fillPolygon(xPoints, yPoints, nPoints);

//sand
        g.setColor(new Color(234, 200, 175));
        g.fillRect(0, 250, w, h);

//ocean
        g.setColor(new Color(15, 76, 92));
        g.fillOval(-800, 300, 2000, 800);

//Cloud#1 shape 1.
        g.setColor(Color.white);
        g.fillOval(40, 80, 110, 20);
        //Cloud shape 2
        g.setColor(Color.white);
        g.fillOval(50, 70, 90, 20);
        //Cloud shape 3
        g.setColor(Color.white);
        g.fillOval(60, 60, 50, 20);
//Cloud#2 shape 1.
        g.setColor(Color.white);
        g.fillOval(50+cx, 80+cy, 110, 20);
        //Cloud shape 2
        g.setColor(Color.white);
        g.fillOval(60+cx, 70+cy, 90, 20);
        //Cloud shape 3
        g.setColor(Color.white);
        g.fillOval(70+cx, 60+cy, 50, 20);
//Cloud#2 shape 1.
        g.setColor(Color.white);
        g.fillOval(50+ccx, 80+ccy, 110, 20);
        //Cloud shape 2
        g.setColor(Color.white);
        g.fillOval(60+ccx, 70+ccy, 90, 20);
        //Cloud shape 3
        g.setColor(Color.white);
        g.fillOval(70+ccx, 60+ccy, 50, 20);
    
//Tree
        //trunk
        g.setColor(new Color (66,57,38));
        g.fillRect(315, 130, 20, 150);
//FOLIAGE 1
        g.setColor(new Color (77,78,34));
        g.fillOval(300, 100, 50, 50);
//FOLIAGE 2
        g.setColor(new Color (77,78,34));
        g.fillOval(280, 120, 45, 45);
//FOLIAGE 3
        g.setColor(new Color (77,78,34));
        g.fillOval(320, 120, 50, 50);
//FOLIAGE 4
        g.setColor(new Color (77,78,34));
        g.fillOval(290, 130, 65, 50);

//BeachHut Base
        g.setColor (Color.darkGray);
        g.fillRect(100+dx, 180+dy, 150, 80);
        //BeachHut Roof layer 1
        g.setColor (Color.lightGray);
        g.fillRect(90+dx, 160+dy, 170, 20);
        //BeachHut Roof layer 2
        g.setColor(Color.lightGray);
        g.fillRect(100+dx, 140+dy, 150, 20);
        //BeachHut Roof layer 3
        g.setColor(Color.lightGray);
        g.fillRect(110+dx, 120+dy, 130, 25);
        //BeachHut Door
        g.setColor(Color.black);
        g.fillRect(190+dx, 200+dy, 40, 60);
        //BeachHut Window
        g.setColor(Color.black);
        g.fillRect(120+dx, 200+dy, 45, 30);
//HUT SIGN
        //Sign Board outer
        g.setColor(new Color(124,83,55));
        g.fillRect(120+dx, 140+dy, 110, 30);
        //Sign Board Inner
        g.setColor(Color.white);
        g.fillRect(125+dx, 145+dy, 100, 20);
        //Name on board
        g.setColor(Color.black);
        g.drawString("Mars's Hut", 145+dx, 160+dy);
    }
void main() {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new BeachHut());
		window.setVisible(true);
	}

}
