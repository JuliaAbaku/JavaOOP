package lesson4.weapons.meleeWeapon;

public class Axe implements Melee{
    @Override
    public int damage() {
        return 30;
    }

    @Override
    public String toString() {
        return String.format("Топор: %d", damage());
    }
}
