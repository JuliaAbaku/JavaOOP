package lesson4.weapons.meleeWeapon;

public class Sword implements Melee{
    @Override
    public int damage() {
        return 5;
    }
    @Override
    public String toString() {
        return String.format("Меч: %d", damage());
    }
}
