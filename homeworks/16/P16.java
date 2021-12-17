public class P16 {
    public static void main(String[] args) {


    Elf elf = new Elf("Finrod");
    Dwarf dwarf = new Dwarf("Gimli");
    Human human1 = new Human("Aragorn");

    dwarf.upgrade(human1);
    dwarf.upgrade(human1);
    Human human2 = human1.reproduce();
    dwarf.upgrade(elf);
    dwarf.upgrade(elf);
    elf.heal();
    elf.heal(human1);
    elf.heal(human2);
    Human human3 = human2.reproduce();

    Creature[] friends = new Creature[5];
    friends[0] = elf;
    friends[1] = dwarf;
    friends[2] = human1;
    friends[3] = human2;
    friends[4] = human3;

    Creature orc = new Creature("Unnamed Orc 43134", 10);

    for (int i=0; i<2; i++) {
        for (Creature friend : friends) {
            friend.attack(orc);
        }
    }
    }
}

