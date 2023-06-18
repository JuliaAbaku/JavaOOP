package lesson4;

import lesson4.warriors.Archer;
import lesson4.warriors.Warrior;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Warrior> implements Iterable<T>{ // поставили дженерик <T>
    private List<T> team = new ArrayList<>();

    public void add(T element){ // Добавление команд
        team.add(element);
    }

    @Override
    public Iterator<T> iterator() {     // Возвращаем итератор команды потому что у нас итак уже список. Не нужно next hasNext
        return team.iterator();
    }

    // Делаем статистику команды

    public int getTeamHealth(){
        int teamHealth = 0;
        for (T t:this) {
            teamHealth += t.getHealthPoint();
        }
        return teamHealth;
    }

    public int maxAttackDistance(){
        int maxDistance = 0;
        for (T t:this) {
            if(!(t instanceof Archer)){
                continue;
            }
            int currentDistance = ((Archer) t).distance();
            if(maxDistance < currentDistance){
                maxDistance = currentDistance;
            }
        }
        return maxDistance;
    }

    public int getTeamAttack(){
        int teamAttack = 0;
        for (T t:this) {
            teamAttack += t.getWeapon().damage();
        }
        return teamAttack;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (T t:this) {
            builder.append(t).append("\n");
        }
        builder.append(String.format("TeamAttack: %d ", getTeamAttack()));
        builder.append(String.format("TeamHealth: %d ", getTeamHealth()));
        builder.append(String.format("maxDistance: %d ", maxAttackDistance()));
        return builder.toString();
    }
}
