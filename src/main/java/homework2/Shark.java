package homework2;

public class Shark extends Fish implements SwimSpeed{
    public Shark(String name) {
        super(name);
    }

    @Override
    public int getSwimSpeed() {
        return 10;
    }

    @Override
    public String toString() {
        return String.format("Shark: %s, Speed: %d", super.toString(), getSwimSpeed());
    }
}
