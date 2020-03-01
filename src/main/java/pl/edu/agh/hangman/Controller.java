package pl.edu.agh.hangman;

public class Controller {

    private Library library = new Library();
    private Game game = new Game();
    private Communicator comms = new Communicator();
    private Graphics graphics = new Graphics();


    public void run() {

        game.setSearchedWord() = library.getRandomWord();
        comms.print("Welcome to HangMan! Try to type letters and guess the whole word.");

        while (game.getTriesLeft() > 0) {
            game.playRound(comms.getText("Your letter?"));


        }

    }


}
