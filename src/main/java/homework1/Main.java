package homework1;

import lesson1.VendingMachine;

public class Main {
    public static void main(String[] args) {

        Vending apparatus = new Vending();

        apparatus.addDrink(new Drink("Вода", 50.00))
                .addDrink(new Water("BonAqua", 100.00, "Газированная", 0.5))
                .addDrink(new Drink("Чай", 35.00))
                .addDrink(new Tea("GreenField", 40.00, "Чёрный", 200.00))
                .addDrink(new Drink("Кофе", 60.00))
                .addDrink(new Coffee("Jacobs", 85.00, "Капучино", 200.00));

        System.out.println(apparatus);
        System.out.println("--------------");

        Drink drink = apparatus.findDrink("Чай");
        System.out.println(drink);
        System.out.println("--------------");

        Drink soldDrink = apparatus.soldDrink("Чай");
        System.out.println("Продажа: ");
        System.out.println(soldDrink);
        System.out.println("--------------");
        System.out.println("Денег в аппарате: ");
        System.out.println(apparatus.getCash());

        System.out.println("--------------");
        System.out.println(apparatus);

    }
}
