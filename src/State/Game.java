package State;

import State.States.NoviceState;

import java.util.Scanner;

public class Game {
    private Scanner scanner = new Scanner(System.in);
    private State state;
    private Player player;

    public Player getPlayer() {
        return player;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Game() {
        System.out.print("Enter your character's name: ");
        String name = scanner.nextLine();
        System.out.println("-----------------------------------");
        player = createPlayer(name);
        state = new NoviceState(this);
    }

    public Player createPlayer(String name) {
        return new Player(name, 1, 0, 100);
    }

    public void start() {
        while (player.getHealth() > 0) {
            System.out.println("Level: " + player.getLevel() + ", XP: " + player.getXp() + ", Health: " + player.getHealth());
            System.out.println(player.getName() + " is now standing");
            state.printOptions();
            System.out.println("-----------------------------------");
        }
    }
}
