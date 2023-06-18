package lesson4;

import lesson4.warriors.Archer;
import lesson4.warriors.Infantrymen;
import lesson4.warriors.Warrior;
import lesson4.weapons.meleeWeapon.Axe;
import lesson4.weapons.meleeWeapon.Sword;
import lesson4.weapons.rangedWeapons.Bow;
import lesson4.weapons.rangedWeapons.CrossBow;

public class Main {
    public static void main(String[] args) {
        Team<Warrior> team1 = new Team<>();
        team1.add(new Archer("Вася", 100, new Bow()));
        team1.add(new Infantrymen("Олег", 100, new Axe()));

        Team<Archer> teamArcher = new Team<>();
        teamArcher.add(new Archer("Борис", 100, new CrossBow()));
        teamArcher.add(new Archer("Витя", 100, new Bow()));

        Team<Infantrymen> teamInfantrymen = new Team<>();
        teamInfantrymen.add(new Infantrymen("Костя",100, new Axe()));
        teamInfantrymen.add(new Infantrymen("Вова",100, new Sword()));

        System.out.println(team1);
        System.out.println("\n");
        System.out.println(teamArcher);
        System.out.println("\n");
        System.out.println(teamInfantrymen);




        Battle battle1 = new Battle((new Infantrymen("Олег", 100, new Axe())), (new Archer("Витя", 100, new Bow())));
        battle1.fight();
    }

}
