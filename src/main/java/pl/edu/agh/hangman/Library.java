package pl.edu.agh.hangman;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Library{
    private  List<String> words = new ArrayList<String>();


    public  void readFile(File poemFile) throws Exception {

            Scanner scanner = new Scanner(poemFile);

            while (scanner.hasNext()) {
                words.add(scanner.next().toLowerCase());
            }
            scanner.close();
        }


    public String getRandomWord() {
        Random rand = new Random();
        String randomWord = words.get(rand.nextInt(words.size()));
        return randomWord;
    }

}




