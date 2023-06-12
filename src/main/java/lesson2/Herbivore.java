package lesson2;

public abstract class Herbivore extends Animal{

    public Herbivore(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "grass";
    }
}
