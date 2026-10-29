import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BeachHut extends JPanel {

        //Hutter Class declaration
    private BeachHutter beachHut;
    private BeachHutter beachHut2;
    private BeachHutter beachHut3;

    public BeachHut() {

        //First beach hut with default coords and colors
        beachHut = new BeachHutter();

        //2ns BeachHut with different coords and colors
        beachHut2 = new BeachHutter(250, -50);
        beachHut2.setRoofColor(Color.red);
        beachHut2.setWallColor(Color.white);

        //3rd BeachHut w/ wall height adjustment
        beachHut3 = new BeachHutter(400, 0);
        beachHut3.setRoofColor(Color.blue);
        beachHut3.setWallColor(Color.GRAY);
        beachHut3.setWallHeight(40);
        beachHut3.setDoorHeight(40);

    }
    

    @Override
    public void paintComponent(Graphics g){

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

        //BeachHut add class
        beachHut.draw(g);
        beachHut2.draw(g);
        beachHut3.draw(g);

    }
}
void main() {
	var window = new JFrame();
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setSize(800,400);
	window.setContentPane(new BeachHut());
	window.setVisible(true);
}

