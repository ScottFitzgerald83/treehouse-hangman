package com.hangman;

public class Hangman {

    public static void main(String[] args) {
        // Start a game of hangman
        Game game = new Game("treehouse");
        Prompter prompter = new Prompter(game);
        while (game.getRemainingTries() > 0) {
            prompter.displayProgress();
            prompter.promptForGuess();
        }
    }
}
