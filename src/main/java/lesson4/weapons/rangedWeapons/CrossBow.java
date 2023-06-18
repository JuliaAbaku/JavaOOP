package lesson4.weapons.rangedWeapons;

public class CrossBow implements Ranged{
    @Override
    public int damage() {
        return 30;
    }

    @Override
    public int distance() {
        return 5;
    }

    @Override
    public String toString() {
        return String.format("Арбалет: %d", damage());
    }
}
