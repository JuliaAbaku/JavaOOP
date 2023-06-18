package lesson4.warriors;

import lesson4.protections.Protection;
import lesson4.weapons.Weapon;
import lesson4.weapons.meleeWeapon.Melee;

public class Infantrymen extends Warrior<Melee, Protection>{
    public Infantrymen(String name, int healthPoint, Melee weapon, int protection) {
        super(name, healthPoint, weapon, protection);
    }

    @Override
    public String toString() {
        return String.format("Пехотинец: %s", super.toString());
    }
}
