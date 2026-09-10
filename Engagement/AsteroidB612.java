import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AsteroidB612 extends JPanel {
	
	public AsteroidB612() {
		//Your custom initialization code here
	}

	@Override
	public void paintComponent(Graphics g) {

		var dx = 0;
		var dy = 0;

		//Your custom rendering code here
		g.setColor(Color.black);
		var w = getWidth();
		var h = getHeight();
		g.fillRect(0,0,w,h);

		//draw planet
		g.setColor(Color.GRAY);
		g.fillOval(-200, 200, 800, 800);

		//draw head
		g.setColor(new Color(189,153,119));
		g.fillOval(180+dx,100+dy,25,25);

		//draw body and legs
		g.setColor(new Color(234,212,101));
		g.fillRect(180+dx,125+dy,25,50);
		g.fillRect(180+dx,175+dy,10,25);
		g.fillRect(195+dx,175+dy,10,25);

		//draw bow
		g.setColor(Color.RED);
		g.fillOval(182+dx,120+dy,10,10);
		g.fillOval(192+dx,120+dy,10,10);


	}

	void main() {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new AsteroidB612());
		window.setVisible(true);
	}
}