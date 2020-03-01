package pl.edu.agh.hangman;

public class Game {

    private int triesLeft = 7;
    private String searchedWord = new String();
    private char[] charactersInWord;
    private String notGuessed = new String();

    public void setSearchedWord(String searchedWord) {
        this.searchedWord = searchedWord;
        this.notGuessed = searchedWord;
        charactersInWord = searchedWord.toCharArray();
    }

    public int getTriesLeft() {
        return triesLeft;
    }

    public String getNotGuessed() {
        return notGuessed;
    }

    public void playRound(String text) {

        String tempGuessed();
        char givenC = text.charAt(0)
        for (int i = 0; i < searchedWord.length(); i++){
            char c = searchedWord.charAt(i);
            if (c == givenC) {
                tempGuessed = tempGuessed + givenC;
            } else {
                tempGuessed = tempGuessed + "_";
                triesLeft = triesLeft - 1;
            }
        }
        notGuessed = tempGuessed;
    }


}
