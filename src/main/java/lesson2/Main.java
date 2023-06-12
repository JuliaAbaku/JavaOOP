package lesson2;

public class Main {
    public static void main(String[] args) {
        Animal bear = new Bear("Потапыч");
        Animal cow = new Cow("Бурёнка");
//        Bird duck = new Duck("Селезень");
//        Animal owl = new Owl("Совунья");

//        System.out.println(bear);
//        System.out.println(cow);


        Zoo zoo = new Zoo();

        zoo.addAnimal(bear)
                .addAnimal(cow)
                .addAnimal(new Duck("Donald")).addAnimal(new Owl("Совунья"));

        System.out.println(zoo);

        System.out.println(zoo.getSound());


        RunSpeed champ = zoo.getRunChampion();
        System.out.println("Самый быстрый бегун: ");
        System.out.println(champ);
        System.out.println("\n");

        System.out.println("Все, кто умеет бегать: ");
        for (RunSpeed runner:zoo.runners()) {
            System.out.println(runner);
        }
        System.out.println("\n");

        System.out.println("Все, кто умеет летать: ");
        for (FlySpeed flyer:zoo.flyers()) {
            System.out.println(flyer);
        }
        System.out.println("\n");

        System.out.println("Все, кто умеет плавать: ");
        for (SwimSpeed swimer:zoo.swimers()) {
            System.out.println(swimer);
        }
        //SwimSpeed champ1 = zoo.getSwimChampion();
        System.out.println("\n");
        System.out.println("Самый быстрый пловец: ");
        System.out.println(zoo.getSwimChampion());
        System.out.println("\n");
        System.out.println("Самый быстрый летун: ");
        System.out.println(zoo.getFlyChampion());




    }


}
