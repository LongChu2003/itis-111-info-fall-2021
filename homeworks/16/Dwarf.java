public class Dwarf extends Creature {
    public Dwarf(String name) {
        super(name, 150);
    }

    public void upgrade(Creature friends) {
        // nang cap lvl
        friends.level++;
        System.out.println(name + " upgrades " + friends.name + " to " + friends.level);
    }
}