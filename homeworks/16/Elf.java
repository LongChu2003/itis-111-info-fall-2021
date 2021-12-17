public class Elf extends Creature {
    public Elf(String name) {
        super(name, 250);
    }

    public void heal() {
        // heal myself
        hp += this.level;
        System.out.println(name + " heals self: " + hp);
    }

    public void heal(Creature friend) {
        // heal team
        friend.hp += this.level;
        System.out.println(name + " heals " + friend.name + ": " + friend.hp);
    }
}