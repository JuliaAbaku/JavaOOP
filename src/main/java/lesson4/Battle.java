package lesson4;

import lesson4.warriors.Warrior;
import lesson4.weapons.Weapon;

public class Battle {
    private Warrior w1;
    private Warrior w2;

    public Battle(Warrior w1, Warrior w2) {
        this.w1 = w1;
        this.w2 = w2;
    }

    public void fight(){
        while (w1.getHealthPoint() > 0 && w2.getHealthPoint() > 0){
            int damage1 = w1.hit();
            System.out.println("Воин 1 нанес урон Воину 2: " + damage1 + ", Броня отбила урона: " + w2.protection);
            w2.reduceHealth(damage1);
            int damage2 = w2.hit();
            System.out.println("Воин 2 нанес урон Воину 1: " + damage2+ ", Броня отбила урона: " + w1.protection);
            w1.reduceHealth(damage2);
            System.out.println(w1);
            System.out.println(w2);
            System.out.println("\n");
        }
    }
}
