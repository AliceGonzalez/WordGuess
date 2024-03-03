package com.github.zipcodewilmington;

import java.util.Random;

public class Wordguess {
    // instance variables go here
    static int guesses = 0;
    static String greeting = "Let's play Wordguess version 10.0!\nCurrent guesses:";

    public static String announce_game(String greeting){
        return greeting;
    }

    public void runGame(){

    }
    public static void main(String[] args){
        String gameGreeting = announce_game(greeting);
        System.out.println(gameGreeting);

        // set up a list (array) of strings of words players could guess
        String[] wordList = {"java", "void", "code", "list", "file", "game", "play", "word", "path", "push", "pull"};

        Random random = new Random();
        int randomIndex = random.nextInt(wordList.length);
        String randomString = wordList[randomIndex]; //Use randomString


        //Wordguess game = new Wordguess();
        //game.runGame();
    }

}
