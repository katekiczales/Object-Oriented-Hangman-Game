import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle {

    //private String word = "hello";
    private String word = "";
    private String guess = "";
    private final int MAX_WORDS = 45402; //
    ArrayList<String> words;// = new ArrayList<String>(); //

    public Puzzle() {    
        // /*
        words = new ArrayList<String>();

        try {
            File file = new File("words.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String tempWord = scanner.next().toUpperCase();
                words.add(tempWord);
            }
            scanner.close();

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // */
        int chosenWord = (int) Math.random()*MAX_WORDS;
        this.word = words.get(chosenWord);

        //this.word = word;
        word = word.toUpperCase();
        this.guess = guess;
    }

    public boolean isUnsolved() {
        for ( int i = 0; i < word.length(); i++ ) {
            char temp = word.charAt(i);
            if ( guess.indexOf(temp) == -1 ) {
                return true;
            }
        }
        return false; 
    }

    public boolean makeGuess(String a) {
        a = a.toUpperCase();
        guess += a;
        if ( word.indexOf(a) != -1 ) {
            return true;
        }
        return false;
    }

    public String getWord() {
        return word;   
    }

    public void show() {
        System.out.println("Puzzle: ");
        for ( int i = 0; i < word.length(); i++ ) {
            String a = word.substring(i, i + 1);
            if ( guess.indexOf(a) != -1 ) {
                System.out.print(a);    
            } else {
                System.out.print("_");
            }
        }

        System.out.println(" ");
        System.out.println("Guessed Letters: " + guess);

    }
}
