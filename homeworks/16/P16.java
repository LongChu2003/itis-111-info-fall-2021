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

class Creature {
    public String name;
    public int hp, level;
    public Creature(String name, int hp){
        this.name = name;
        this.hp = hp;
        this.level = 1;
    }
    public void attack(Creature other){
        other.hp -= level;
        System.out.println(name  + "attacks " + other.name + ": "+  other.hp + " left");
    }
}
class Elf extends Creature {
    public Elf(String name){
        super(name, 250);
    }
    public void heal(){
        this.hp +=level;
        System.out.println(name + " heals self: " + hp);
    }
    public void heal(Creature friend){
        friend.hp += level;
        System.out.println(name + " heals " + friend.name + ": " + friend.hp);
    }
}

class Dwarf extends Creature {
    public Dwarf(String name){
        super(name, 150);
    }
    public void upgrade(Creature friend){
        friend.level +=1;
        System.out.println(name + " upgrade " + friend.name + " to " + friend.level);
    }
}

class Human extends Creature {
    public Human(String name){
        super(name, 100);
    }
    public Human reproduce(){
        Human son = new Human(name + ", son of " + name);
        this.level /= 2;
        son.level = level/2;
        son.hp = hp;
        System.out.println(name + " gives birth to " + son.name + ": " + level);
        return son;
    }
}