package pl.sdacademy.intermediate.basic.basic7;

import java.util.*;

public class Basic7UserInput {
    private String answerString;
    private List<String> answerArray = new ArrayList<>();
    private List<String> visibleAnswer = new ArrayList<>();
    private Set<String> providedLetters = new HashSet<>();
    private boolean continueGame = true;
    private int life = 3;
    private int numberOfLettersLeftToGuess;

    private void prepareTheGame() {
        answerString = "aba";
        numberOfLettersLeftToGuess = answerString.length();
        for (char c : answerString.toCharArray()) {
            answerArray.add(String.valueOf(c));
            visibleAnswer.add("*");
        }
    }

    private String getLetterFromConsole() {
        System.out.println("Provide a letter");
        Scanner scr = new Scanner(System.in);
        String answer = scr.nextLine();
        while (answer.length() != 1) {
            System.out.println("Incorrect input, try again");
            answer = scr.nextLine();
        }
        System.out.println("Answer: " + answer);
        return answer.toLowerCase();
    }

    public void startGame() {
        prepareTheGame();
        String letter;
        while (continueGame) {
            System.out.println("Visible password:");
            System.out.println(visibleAnswer);
            letter = getLetterFromConsole();

            if (providedLetters.contains(letter)) {
                System.out.println("The letter has been already used");
            } else if (answerArray.contains(letter)) {
                System.out.println("You got it!");
                for (int i = 0; i < answerArray.size(); i++) {
                    if (answerArray.get(i).equals(letter)) {
                        answerArray.set(i, "");
                        visibleAnswer.set(i, letter);
                        providedLetters.add(letter);
                        numberOfLettersLeftToGuess--;
                    }
                }
            } else {
                System.out.println("The letter does not appear in the answer");
                providedLetters.add(letter);
                life--;
                System.out.printf("You have %d chances left\n", life);
            }

            if (life == 0) {
                System.out.println("You lose, game over");
                continueGame = false;
            }

            if (numberOfLettersLeftToGuess == 0) {
                System.out.printf("You win! The password was: %s\n", answerString);
                continueGame = false;
            }
        }
    }

    public static void main(String[] args) {
        Basic7UserInput basic = new Basic7UserInput();
        basic.startGame();
    }
}
