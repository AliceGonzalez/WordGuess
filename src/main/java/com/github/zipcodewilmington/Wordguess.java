package com.github.zipcodewilmington;
import java.util.Random;
import java.util.Scanner;

public class Wordguess {
    // instance variables go here
    char[] guesses;
    int allowedTries = 6;
    int currentTries = 0;
    String secretWord = "";
    char[] wordArray;

    // set up a list (array) of strings of words
    String[] wordList = {"java", "void", "code", "list", "file", "game", "play", "word", "path", "push", "pull"};

    public static void main(String[] args) {
        Wordguess game = new Wordguess();
        game.runGame();
    }

    private void announceGame() {
        System.out.println("Welcome!\nLet's play Wordguess version 10.0!");
    }

    private void gameOver() {
        System.out.println("GAME OVER! Try again.");
    }

    private void initializeGameSlate() {
        guesses = new char[secretWord.length()];
        for (int i = 0; i < secretWord.length(); i++) {
            guesses[i] = '_';
        }
    }

    private char getNextGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        String input = scanner.nextLine();

        if (input.length() == 1) {
            char letter = input.charAt(0);
            if (Character.isLetter(letter)) {
                return letter;
            }
        }
        return 0; // Returns 0 if input is invalid
    }

    private boolean isWordGuessed() {
        for (int i = 0; i < guesses.length; i++) {
            if (guesses[i] != wordArray[i]) {
                return false;
            }
        }
        return true;
    }

    private boolean askToPlayAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like to play again? (yes/no) ");
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("yes");
    }

    private void printCurrentSlate() {
        for (char guess : guesses) {
            System.out.print(guess + " ");
        }
        System.out.println();
    }

    private void process(char nextGuess) {
        boolean guessFound = false;
        for (int i = 0; i < secretWord.length(); i++) {
            if (wordArray[i] == nextGuess && guesses[i] == '_') {
                guesses[i] = nextGuess;
                guessFound = true;
            }
        }
        if (!guessFound) {
            currentTries++;
        }
    }

    private void playerWon() {
        System.out.println("You guessed the secret word!\nCongratulations! :)");
    }

    private void playerLost() {
        System.out.println("You lost :(\nThe word was: " + secretWord);
    }

    public void runGame() {
        Random random = new Random();
        secretWord = wordList[random.nextInt(wordList.length)];
        wordArray = secretWord.toCharArray();
        initializeGameSlate();

        do {
            announceGame();
            while (!isWordGuessed() && currentTries < allowedTries) {
                printCurrentSlate();
                char nextGuess = getNextGuess();
                if (nextGuess != 0) {
                    process(nextGuess);
                } else {
                    System.out.println("Invalid input. Please enter a valid letter.");
                }
            }
            if (isWordGuessed()) {
                playerWon();
            } else {
                playerLost();
            }
            currentTries = 0;  // Reset tries for next game
            initializeGameSlate();  // Reset game state
        } while (askToPlayAgain());

        gameOver();
    }
}

