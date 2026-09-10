import javax.swing.JFrame;
import javax.swing.JPanel;


public class Windows extends JPanel {

    public static void main(String [] args) {
       //create a new window
        var window = new JFrame(); 
       
       //set the window to be 200 pixels wide, 200 pixels high
        window.setSize(300,300);
       
       //close the app when the user closes the window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBackground(bgColor.Brown);
        window.setFont(font.times);
       /*make the Windows class responsible for the contents
       of our window */
        window.setContentPane(new Windows());

        window.setVisible(true);
    }
}