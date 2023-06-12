package homework2;

public class Carp extends Fish implements SwimSpeed{
    public Carp(String name) {
        super(name);
    }

    @Override
    public int getSwimSpeed() {
        return 3;
    }

    @Override
    public String toString() {
        return String.format("Carp: %s, Speed: %d", super.toString(), getSwimSpeed());
    }
}
