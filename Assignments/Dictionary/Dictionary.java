package Assignments.Dictionary;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Dictionary extends JPanel {
    
    //Fields that stores thes words
    ArrayList<String> maori;
    ArrayList<String> english;
    
    //Constructor
    public Dictionary() {
        loadEnglishWords();
        loadMaoriWords();
        mainLoop();
    }

    //methods
    public void loadEnglishWords() {
        english = new ArrayList<>();

        try {
            String eFile = "english.txt";
            File englishFile = new File(eFile);
            Scanner e = new Scanner(englishFile);

            while (e.hasNextLine()) { 
                String word = e.nextLine().trim();
                english.add(word);
            }
            e.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "File Not Found" );
        }
    } 


    public void loadMaoriWords() {
       maori = new ArrayList<>();

        try {
            String mFile = "maori.txt";
            File maoriFile = new File(mFile);
            Scanner m = new Scanner(maoriFile);

            while (m.hasNextLine()) { 
                String word = m.nextLine().trim();
                maori.add(word);
            }
            m.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "File Not Found" );
        }
    }



    public String lookup(String word) {
        String result = "No match found.";

        for (int i=0; i < english.size(); i++) {
            if(word.equals(english.get(i))) {
                return maori.get(i);
            }
        }
        return result;
    }


    public void mainLoop() {
        while(true) {
            //prompting for input
            String eword = JOptionPane.showInputDialog("Enter an english word: ");
            String output = lookup(eword);

            //showing output to user
            int yn = JOptionPane.showConfirmDialog(null, output);
            if (yn == JOptionPane.NO_OPTION)
            break;
        }
    }

    void main() {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new Dictionary());
		window.setVisible(true);
	}

}