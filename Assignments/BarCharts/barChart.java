import java.awt.Graphics;
import java.io.File;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class barChart extends JPanel {

    public barChart() {
        //file to read.
        String filename = "scores10.csv";
        File f = new File(filename);
        
        //reads file
        try {
            Scanner s = new Scanner(f);

            String firstLine = s.nextLine();
            joystick = firstLine.split(",");

            //Gets skips player ID when calculating scores
            int numJoysticks = joystick.length - 1;
            totals = new double[numJoysticks];
            average = new double[numJoysticks];

            s.close();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found.");
        }
        
        

    }

    String[] joystick;
    double[] totals;
    double[] average;


    @Override
    public void paintComponent(Graphics g) {

    }
    
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600,400);
        window.setContentPane(new barChart());
        window.setVisible(true);
    }
}