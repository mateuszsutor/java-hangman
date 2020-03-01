package pl.edu.agh.hangman;

//import java.util.ArrayList;
import java.util.Scanner;

public class Communicator {

    private Scanner scanner = new Scanner(System.in);

    //methods
    public void print(String text) {
        System.out.println(text);
    }

//    public void print(ArrayList<String> texts) {
//
//        for (String s: texts) {
//            print(s);
//        }
//    }

    public String getText() {
        return scanner.next();
    }

    public String getText(String question) {
        print(question);
        return scanner.next();
    }

    public int getNumber() {
        return scanner.nextInt();
    }
}