public class FunWithArrays {
    
    void main() {
        String[] row1 = {"Thoai", "Karl", "Mars", "Kyosuke"};
        String[] row1 = new String [5];
        row1 [4] = "Kepu";
        row1 [3] = "Kyosuke";
        row1 [2] = "Mars";
        row1 [1] = "Karl";
        row1 [0] = "Thoai";

        for (var n : row1) {
            IO.println(n+"'s favourite class is CS202!");
        }

        //double[] quizScores = {100, 90, 80, 70, 65.7, 15.5, 98.6, 5.4};
        String csv = "100,90,80,70,65.7,15.5,98.6,5.4";
        String{} rexzina = csv.split(",");

        row1[1] = "Mars";
        row1[2] = "Karl";
        Io.println"Switching Mars and Karl!)";
        for (var n: row1) {
            IO.println(n+"'s favourite class is CS202!");
        }

        double avg = 0; 
        double sum = 0;
        for (var score : quizScores) {
            //IO.println ("processing score: " + score);
            double shane = souble.pa
            sum = sum + score;
        }
        avg = sum / rexzina.length;
        IO.println ("The average score is: " + avg);
    }
}

//Compile time bugs. 
// Run-time  bugs;
//CSV = "comma seperated values" 