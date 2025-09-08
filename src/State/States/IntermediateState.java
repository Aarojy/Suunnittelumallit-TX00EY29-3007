package State.States;

import State.State;
import State.Game;

public class IntermediateState extends State {

    public IntermediateState(Game game) {
        super(game);
    }

    public void printOptions() {
        System.out.println("Intermediate State: You can train and meditate.");
        System.out.println("Enter 1 to train or 2 to mediate.");
        String input = this.getGame().getScanner().nextLine();

        switch (input) {
            case "1":
                this.getGame().getPlayer().gainXp(5);
                System.out.println("You trained and gained 5 XP!");
                break;
            case "2":
                this.getGame().getPlayer().gainXp(20);
                System.out.println("You meditated and gained 20 XP!");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                this.printOptions();
                break;
        }

        if (this.getGame().getPlayer().getLevel() >= 3) {
            this.getGame().setState(new ExpertState(this.getGame()));
        }
    }
}

