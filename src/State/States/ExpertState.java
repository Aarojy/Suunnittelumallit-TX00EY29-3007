package State.States;

import State.State;
import State.Game;

public class ExpertState extends State {

    public ExpertState(Game game) {
        super(game);
    }

    public void printOptions() {
        System.out.println("Expert State: You can train, meditate or fight.");
        System.out.println("Enter 1 to train, 2 to mediate or 3 to fight!");
        String input = this.getGame().getScanner().nextLine();

        switch (input) {
            case "1":
                this.getGame().getPlayer().gainXp(1);
                System.out.println("You trained and gained 1 XP!");
                break;
            case "2":
                this.getGame().getPlayer().gainXp(5);
                System.out.println("You meditated and gained 5 XP!");
                break;
            case "3":
                this.getGame().getPlayer().gainXp(20);
                System.out.println("You fought and gained 15 XP!");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                this.printOptions();
                break;
        }

        if (this.getGame().getPlayer().getLevel() >= 4) {
            this.getGame().setState(new MasterState(this.getGame()));
        }
    }
}
