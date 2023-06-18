package lesson4;

public class Armor {
    public int protection(){
        return 10;
    }
    @Override
    public String toString() {
        return String.format("Броня: %d", protection());
    }
}
