package State.States;

import State.State;
import State.Game;

public class MasterState extends State {

    public MasterState(Game game) {
        super(game);
    }

    public void printOptions() {
        System.out.println("You have reached the Master level! You are unstoppable!");
        this.getGame().getScanner().nextLine();
    }
}
