package lesson4.weapons.rangedWeapons;

public class Bow implements Ranged{
    @Override
    public int damage() {
        return 5;
    }

    @Override
    public int distance() {
        return 5;
    }

    @Override
    public String toString() {
        return String.format("Лук: %d", damage());
    }
}
