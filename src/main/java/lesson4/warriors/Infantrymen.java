package lesson4.warriors;

import lesson4.weapons.Weapon;
import lesson4.weapons.meleeWeapon.Melee;

public class Infantrymen extends Warrior<Melee>{
    public Infantrymen(String name, int healthPoint, Melee weapon) {
        super(name, healthPoint, weapon);
    }

    @Override
    public String toString() {
        return String.format("Пехотинец: %s", super.toString());
    }
}
