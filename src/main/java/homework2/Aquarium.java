package homework2;

import lesson2.Animal;
import lesson2.Zoo;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List<Fish> aquarium = new ArrayList<>();

    public Aquarium addFish(Fish someFish){
        aquarium.add(someFish);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("В аквариуме: \n");
        for (Fish fish:aquarium) {
            builder.append(fish)
                    .append("\n");
        }
        return builder.toString();
    }

    public List<SwimSpeed> swimers() {
        List<SwimSpeed> swimers = new ArrayList<>();
        for (Fish fish:aquarium) {
            if(fish instanceof SwimSpeed){
                swimers.add((SwimSpeed) fish);
            }
        }
        return swimers;
    }


    public SwimSpeed getSwimChampion(){
        List<SwimSpeed> swimers = swimers();
        SwimSpeed champ = swimers.get(0);
        for (SwimSpeed swimer:swimers) {
            if(champ.getSwimSpeed()<swimer.getSwimSpeed()){
                champ = swimer;
            }
        }
        return champ;
    }

}
