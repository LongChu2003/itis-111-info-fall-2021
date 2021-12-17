public class Creature {
    String name;
    int hp;
    int level = 1;

    public Creature(String name, int hp) {
        this.name = name;
        this.hp = hp;
        // System.out.println(name + " " + hp + " " + level);
    }

    public void attack(Creature other) {
        // attack
        other.hp -= this.level;
        System.out.println(name + " attacks " + other.name + ": " + other.hp + " left");
    }
}