package State;

public class Player {
    String name;
    private int level;
    private int xp;
    private int health;

    public Player(String name, int level, int xp, int health) {
        this.name = name;
        this.level = level;
        this.xp = xp;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getXp() {
        return xp;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public void gainXp(int xp) {
        this.xp += xp;
        while (this.xp >= 100) {
            this.xp -= 100;
            this.level++;
        }
    }
}
