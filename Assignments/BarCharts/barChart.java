import java.awt.Graphics;
import java.io.File;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class barChart extends JPanel {

    public barChart() {
        //variabls
        String[] joystick;
        double[] totals;
        double[] average;
        int numPlayers = 0;

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

            //Reads each line untile there are no more lines in the file.
            while (s.hasNextLine()) {
                String line = s.nextLine();
                //Seperates the values
                String[] values = line.split(",");

                //Totals the scores and also skips player ID w/ i + 1
                for (int i = 0; i < numJoysticks; i++) {
                    totals[i] += Double.parseDouble(values[i + 1]);
                }

                //Counts how many players
                numPlayers++;
            }
            //closes the file
            s.close();
        
            //calculates the average
            for (int i = 0; i < numJoysticks; i++) {
                average[i] = totals[i] / numPlayers;
            }

        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found.");
        }

    }

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