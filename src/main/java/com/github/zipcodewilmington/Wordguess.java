package com.github.zipcodewilmington;

import java.util.Random;
import java.util.Scanner;

public class Wordguess {
    // instance variables go here
    int allowedTries = 0;
    int currentTries = 0;

    // set up a list (array) of strings of words
    String[] wordList = {"java", "void", "code", "list", "file", "game", "play", "word", "path", "push", "pull"};


    private void announceGame(){System.out.println("Welcome!\nLet's play Wordguess version 10.0!");
    }

    private void gameOver(){System.out.print("GAME OVER!");
    }

    private void initializeGameSlate(){
        //sets up char[] for secret word and guesses
    }

    private char getNextGuess(char userGuess){
        //returns a char from player input
        Scanner nextGuess = new Scanner(System.in);
        System.out.print("Enter a single character:");
        //char nextGuess = Scanner.nextLine();
        return userGuess;
    }

    private boolean isWordGuessed(boolean guessedWord){
        //returns boolean
        return guessedWord;
    }

    private boolean askToPlayAgain(boolean userAnswer){
        Scanner ask_to_play = new Scanner(System.in);
        System.out.print("Would you like to play again?");
        //boolean ask_to_play = Scanner.nextLine();
       return userAnswer;
    }

    private void printCurrentSlate(){
        //uses printArray to show player where they are at
    }

    private void process(){
        //loops trhu the word array, looking for the inputed guess, and replaces the _ with the guessses char if found
    }

    private void playerWon(){System.out.println("You guessed the secret word!\nCongratulations! :)");
    }

    private void playerLost(){System.out.println("You lost :(");
    }

    public void runGame(){//choose random word from list below
        Random random = new Random();
        int randomIndex = random.nextInt(wordList.length);
        String randomString = wordList[randomIndex]; //Use randomString



//        while (you want to play) { //outer loop
        announceGame();
//            set word guessed to false
//            while (the word isn't guessed) { //inner loop
//            print the current game state
//            ask for a guess (a single letter)
//
//            check the letter against the word
//            using the two character arrays discussed above
//            increment the number of guesses
//
//            if the word is guessed
        playerWon();
//
//            if too many guesses
        playerLost();
//        }
//        ask if player wants to play again


//    }
        gameOver();

    }



    public static void main(String[] args){
        Wordguess game1 = new Wordguess();
        game1.runGame();
    }
}
