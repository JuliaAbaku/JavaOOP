package homework2;

public class Main {
    public static void main(String[] args) {
       Aquarium aquarium = new Aquarium();
       aquarium.addFish(new Shark("Акула")).addFish(new Dolphin("Дельфин")).addFish(new Carp("Карп"));
        System.out.println(aquarium);

        System.out.println("Все, кто умеет плавать: ");
        for (SwimSpeed swimer: aquarium.swimers()) {
            System.out.println(swimer);
        }

        System.out.println("\n");
        System.out.println("Самый быстрый пловец: ");
        System.out.println(aquarium.getSwimChampion());
    }
}
