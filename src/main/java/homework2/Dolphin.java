package homework2;

public class Dolphin extends Fish implements SwimSpeed{
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public int getSwimSpeed() {
        return 8;
    }
    @Override
    public String toString() {
        return String.format("Dolphin: %s, Speed: %d", super.toString(), getSwimSpeed());
    }
}
