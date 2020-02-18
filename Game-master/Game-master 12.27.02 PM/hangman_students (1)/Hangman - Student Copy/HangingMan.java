public class HangingMan {

    private int indexParts = 0;
    private int numWrongGuesses;
    String[] HangmanImage = {"+----+\n"+
            "|\n"+
            "|\n"+
            "|\n"+
            "/\\\n", //gallows

            "+----+\n"+
            "|    O\n"+
            "|\n"+
            "|\n"+
            "/\\\n", //head

            "+----+\n"+
            "|    O\n"+
            "|    +\n"+
            "|\n"+
            "/\\\n", //torso

            "+----+\n"+
            "|    O\n"+
            "|    +-\n"+
            "|\n"+
            "/\\\n", //R arm

            "+----+\n"+
            "|    O\n"+
            "|   -+-\n"+
            "|\n"+
            "/\\\n", //L arm

            "+----+\n"+
            "|    O\n"+
            "|   -+-\n"+
            "|   / \n"+
            "/\\\n", //leg1

            "+----+\n"+
            "|    O\n"+
            "|   -+-\n"+
            "|   / \\\n"+
            "/\\\n",//leg2
        };

    public HangingMan() {
        this.HangmanImage = HangmanImage;
        this.numWrongGuesses = numWrongGuesses;
        this.indexParts = indexParts;
    }

    public void show() {
        System.out.println(HangmanImage[indexParts]);
    }

    public boolean isntDead() {
        if ( indexParts == 6 ) {
            return false;
        }
        return true; 
    }

    public void dieSomeMore() {
        indexParts++;
    }

}
