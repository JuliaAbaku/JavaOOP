package lesson2;

public class Bear extends Predator implements RunSpeed, SwimSpeed{


    public Bear(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Rwrwrwrwwr";
    }

    @Override
    public String toString() {
        return String.format("Bear: %s, Speed: %d, SwimSpeed: %d", super.toString(), getRunSpeed(), getSwimSpeed());
    }

    @Override
    public int getRunSpeed() {
        return 15;
    }

    @Override
    public int getSwimSpeed() {
        return 30;
    }
}
