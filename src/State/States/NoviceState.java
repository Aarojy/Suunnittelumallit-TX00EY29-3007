package State.States;

import State.State;
import State.Game;

public class NoviceState extends State {

    public NoviceState(Game game) {
        super(game);
    }

    public void printOptions() {
        System.out.println("Novice State: You can only train.");
        System.out.println("Enter 1 to train.");
        String input = this.getGame().getScanner().nextLine();

        switch (input) {
            case "1":
                this.getGame().getPlayer().gainXp(20);
                System.out.println("You trained and gained 20 XP!");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                this.printOptions();
                break;
        }


        if (this.getGame().getPlayer().getLevel() >= 2) {
            this.getGame().setState(new IntermediateState(this.getGame()));
        }
    }
}
