package pl.edu.agh.hangman;

import java.io.File;

public class Controller {

    private Library library = new Library();
    private Game game = new Game();
    private Communicator comms = new Communicator();
    private Graphics graphics = new Graphics();


    public void run() throws Exception {

        int functionIndex = 0;
        comms.print("Welcome to HangMan! Please choose the word generation method\n" +
                    "1 - Automatic\n");

        functionIndex = comms.getNumber();

        switch (functionIndex) {
            case 1:
                File file = new File(
                        Library.class.getClassLoader().getResource("slowa.txt").getFile()
                );
                library.readFile(file);
                game.setSearchedWord(library.getRandomWord());
                break;
        }

        while (game.getTriesLeft() > 0) {
            game.playRound(comms.getText("Your letter?").toLowerCase());
            comms.print(graphics.getAnimation(game.getTriesLeft()));
            comms.print(game.getNotGuessed());
        }

    }


}
