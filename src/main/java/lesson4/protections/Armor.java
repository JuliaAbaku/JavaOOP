package lesson4.protections;

import java.util.Random;

public class Armor implements Protection {
    @Override
    public int protection() {
        return 10;
    }

//    @Override
//    public int protection() {
//        Random rnd = new Random();
//        return rnd.nextInt(0,20);
//    }
    @Override
    public String toString() {
        return String.format("Броня: %d", protection());
    }



}
