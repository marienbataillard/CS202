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

        //mountains
        g.setColor(new Color(124,83,55));
        int[] xPoints = { 50, 100, 75};
        int[] yPoints = { 50, 50, 20};
        int nPoints = 3;
        g.fillPolygon(xPoints, yPoints, nPoints);


    }
void main() {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new BeachHut());
		window.setVisible(true);
	}

}
