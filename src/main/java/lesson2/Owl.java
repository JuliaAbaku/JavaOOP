package lesson2;

public class Owl extends Bird implements RunSpeed, FlySpeed{

    public Owl(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Woohoo";
    }

    @Override
    public String feed() {
        return "Мыши";
    }

    @Override
    public int getRunSpeed() {
        return 1;
    }

    @Override
    public String toString() {
        return String.format("Owl: %s, Speed: %d, FlySpeed: %d", super.toString(), getRunSpeed(), getFlySpeed());
    }

    @Override
    public int getFlySpeed() {
        return 50;
    }
}
