package com.hangman;

class Game {
    private String answer;
    private String hits;
    private String misses;

    public Game(String answer) {
        this.answer = answer;
        hits = "";
        misses = "";
    }

    public boolean applyGuess(char letter) {
        boolean isHit = answer.indexOf(letter) != -1;
        if (isHit) {
            hits += letter;
        } else {
            misses += letter;
        }
        return isHit;
    }

    public String getCurrentProgress() {
        StringBuilder progress = new StringBuilder();
        for (char letter : answer.toCharArray()) {
            char display = '_';
            if (hits.indexOf(letter) != -1) {
                display = letter;
            }
            progress.append(display);
        }
        return progress.toString();
    }
}