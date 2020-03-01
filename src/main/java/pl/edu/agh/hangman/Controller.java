package pl.edu.agh.hangman;

public class Controller {

    private Library library = new Library();
    private Game game = new Game();
    private Communicator comms = new Communicator();
    private Graphics graphics = new Graphics();


    public void run() {

        comms.print("Welcome to HangMan! Please choose the word generation method");

        library.readFile();
        game.setSearchedWord(library.getRandomWord());

        while (game.getTriesLeft() > 0) {
            game.playRound(comms.getText("Your letter?"));
            comms.print(graphics.getAnimation(game.getTriesLeft()));
            comms.print(graphics.getWord(game.getGuessed()));



        }

    }


}
