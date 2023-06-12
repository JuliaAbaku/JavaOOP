package lesson2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private Radio radio = new Radio();
    private List<Animal> zoo = new ArrayList<>();

    public Zoo addAnimal(Animal someAnimal){
        zoo.add(someAnimal);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("В зоопарке: \n");
        for (Animal animal:zoo) {
            builder.append(animal)
                    .append("\n");
        }
        return builder.toString();
    }


    private List<Soundable> getSoundable(){
        List<Soundable> result = new ArrayList<>(zoo);
//        List<Soundable> result = new ArrayList<>();
//        for (Animal animal:zoo) {
//            result.add(animal);
//        }
        result.add(radio);
        return result;
    }

    public String getSound(){
        StringBuilder builder = new StringBuilder();
        for (Soundable soundable:getSoundable()) {
            builder.append(soundable.sound()).append("\n");
        }
        return builder.toString();
    }

    public List<RunSpeed> runners(){
        List<RunSpeed> runners = new ArrayList<>();
        for (Animal animal:zoo) {
            if (animal instanceof RunSpeed){
                runners.add((RunSpeed) animal);
            }
        }
        return runners;
    }

    public RunSpeed getRunChampion(){
        List<RunSpeed> runners = runners();
        RunSpeed champ = runners.get(0);
        for (RunSpeed runner:runners) {
            if (champ.getRunSpeed() < runner.getRunSpeed()) {
                champ = runner;
            }
        }
        return champ;
    }

    public List<FlySpeed> flyers(){
        List<FlySpeed> flyers = new ArrayList<>();
        for (Animal animal:zoo) {
            if (animal instanceof FlySpeed){
                flyers.add((FlySpeed) animal);
            }
        }
        return flyers;
    }

    public List<SwimSpeed> swimers(){
        List<SwimSpeed> swimers = new ArrayList<>();
        for (Animal animal:zoo) {
            if (animal instanceof SwimSpeed){
                swimers.add((SwimSpeed) animal);
            }
        }
        return swimers;
    }

    public SwimSpeed getSwimChampion(){
        List<SwimSpeed> swimers = swimers();
        SwimSpeed champ = swimers.get(0);
        for (SwimSpeed swimer:swimers) {
            if (champ.getSwimSpeed() < swimer.getSwimSpeed()) {
                champ = swimer;
            }
        }
        return champ;
    }

    public FlySpeed getFlyChampion(){
        List<FlySpeed> flyers = flyers();
        FlySpeed champ = flyers.get(0);
        for (FlySpeed flyer:flyers) {
            if (champ.getFlySpeed() < flyer.getFlySpeed()) {
                champ = flyer;
            }
        }
        return champ;
    }
}
