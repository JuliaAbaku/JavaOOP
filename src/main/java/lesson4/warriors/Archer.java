package lesson4.warriors;

import lesson4.protections.Armor;
import lesson4.protections.Protection;
import lesson4.weapons.Weapon;
import lesson4.weapons.rangedWeapons.Ranged;

public class Archer extends Warrior<Ranged, Protection>{
    public Archer(String name, int healthPoint, Ranged weapon, int protection) {
        super(name, healthPoint, weapon, protection);
    }


// На какую дистанцию бьет лучник. Скастовали
    public int distance(){
        return super.getWeapon().distance();
    }


    @Override
    public String toString() {
        return String.format("Лучник: %s, Дистанция стрельбы: %d",super.toString(), distance());
    }
}
