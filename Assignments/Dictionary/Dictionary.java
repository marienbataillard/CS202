package assignments.dictionary;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
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
            String eFile = "C:\\Users\\jgbpoidi7v_byuh\\repository-copy\\Assignments\\Dictionary\\english.txt";
            File englishFile = new File(eFile);

            
            System.out.println("Looking here: " + englishFile.getAbsolutePath());
            System.out.println("File exists: " + englishFile.exists());
        
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
            String mFile = "C:\\Users\\jgbpoidi7v_byuh\\repository-copy\\Assignments\\Dictionary\\maori.txt";
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


    //Method that looks through the files for the words and matches it
    public String lookup(String word) {
        String result = "No match found.";

        for (int i=0; i < english.size(); i++) {
            if(word.equals(english.get(i))) {
                return maori.get(i);
            }
        }
        return result;
    }

    //Method that shows a lot of the output stuff
    public void mainLoop() {
        while(true) {
            //prompting for input
            String eword = JOptionPane.showInputDialog("Enter an english word: ");

            if (eword == null){
                break;
            }
            String output = lookup(eword);


            //showing output to user
            int yn = JOptionPane.showConfirmDialog(null, "The Maori word is: " + output+ "\nWant to play again?", "Dictionary", JOptionPane.YES_NO_OPTION);

            if (yn == JOptionPane.NO_OPTION) {
            break;
            }
        }
    }

    public static void main(String[] args) {
		Dictionary dictionary = new Dictionary();
	}

}