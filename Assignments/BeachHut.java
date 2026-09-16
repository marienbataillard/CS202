import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BeachHut extends JPanel {
    public BeachHut() {

    }

    @Override
    public void paintComponent(Graphics g){

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

        //mountain 2
        g.setColor(new Color(171,144,114));
        int[] gPoints = { 250, 200, 50};
        int[] hPoints = { 250, 250, 100};
        int rPoints = 3;
        g.fillPolygon(gPoints, hPoints, rPoints);

        //FOLIAGE
        g.setColor(new Color (77,78,34));
        g.fillOval(300, 100, 50, 50);

        //FOLIAGE
        g.setColor(new Color (77,78,34));
        g.fillOval(260, 120, 50, 50);

        //FOLIAGE
        g.setColor(new Color (77,78,34));
        g.fillOval(340, 120, 50, 50);

        //sand
        g.setColor(new Color(234, 200, 175));
        g.fillRect(0, 250, w, h);

    }
void main() {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new BeachHut());
		window.setVisible(true);
	}

}
