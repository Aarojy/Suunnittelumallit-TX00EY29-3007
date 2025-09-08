package Template_Method;

import java.util.Scanner;

public class DiceGame extends Game {
    int playerCount;
    int[] scores;
    Scanner sc = new Scanner(System.in);

    @Override
    public void initializeGame(int numberOfPlayers) {
        playerCount = numberOfPlayers;
        scores = new int[numberOfPlayers];

        System.out.println("Starting a dice game with " + playerCount + " players.");
        System.out.println("------------------------------------------------------");
    }

    @Override
    public boolean endOfGame() {
        for (int i = 0; i < playerCount; i++) {
            if (scores[i] >= 50) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void playSingleTurn(int player) {
        System.out.println("Player " + (player + 1) + "'s turn. Press Enter to roll the dice.");
        sc.nextLine();
        int diceRoll = (int)(Math.random() * 6) + 1;

        scores[player] += diceRoll;

        System.out.println("Player " + (player + 1) + " rolled a " + diceRoll + ".");
        System.out.println("Player " + (player + 1) + "'s total score is now " + scores[player] + ".");
        System.out.println("------------------------------------------------------");


    }

    @Override
    public void displayWinner() {
        int maxAt = 0;

        for (int i = 0; i < scores.length; i++) {
            maxAt = scores[i] > scores[maxAt] ? i : maxAt;
        }

        System.out.println("Player " + (maxAt + 1) + " wins with a score of " + scores[maxAt] + "!");
    }
}
