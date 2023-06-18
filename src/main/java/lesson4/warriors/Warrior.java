package lesson4.warriors;

import lesson4.protections.Protection;
import lesson4.weapons.Weapon;

import java.util.Random;

public abstract class Warrior<W extends Weapon, P extends Protection> {
    private String name;
    private int healthPoint;
    public W weapon;
    public int protection;


// Создаем конструктор класса
    public Warrior(String name, int healthPoint, W weapon, int protection) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.protection = protection;
    }

// Создаем геттер
    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public W getWeapon() {
        return weapon;
    }

    public int getProtection(){
        return protection;
    }

// Создаем сеттер
    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    public void setProtection(int protection){
        this.protection = protection;
    }

// Метод урона

//    public int hit(){
//        Random rnd = new Random();
//        int hitDamage = rnd.nextInt(0, weapon.damage()+1);
//        hitDamage = hitDamage - protection;
//        if(hitDamage <= 0){
//            hitDamage = 0;
//        }
//        return hitDamage;
//    }

    public int hit(){
        Random rnd = new Random();
        int hitDamage = rnd.nextInt(0, weapon.damage()+1);
        return hitDamage;
    }

// Метод понижения здоровья
    public void reduceHealth(int damage){
        damage = damage - protection;
        if(damage <=0){
            healthPoint = healthPoint;
        }
        else{
            healthPoint = healthPoint - damage;
        }
        if (healthPoint < 0){
            healthPoint = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Имя: %s, Оружие: %s, Здоровье: %d, Броня: %d", name, weapon, healthPoint, protection);
    }
}
