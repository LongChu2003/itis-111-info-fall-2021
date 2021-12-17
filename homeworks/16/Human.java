public class Human extends Creature {
    public Human(String name) {
        super(name, 100);
    }

    public Human reproduce() {
        Human son = new Human(name);
        son.name = name + ", son of " + name;
        son.level = level / 2;
        System.out.println(this.name + " gives birth to " + son.name + ": " + son.level);

        this.level = level / 2;

        return son;
    }
}