package homework1;

import lesson1.Product;

import java.util.ArrayList;
import java.util.List;

public class Vending {

    // Создаю список, в который будут добавляться напитки
    private List<Drink> vending = new ArrayList<>();
    private double cash = 0;

    // Код для добавления напитка в список
    public Vending addDrink (Drink drink){
        vending.add(drink);
        return this;
    }

    // Получение списка напитков
    public List<Drink> getVending(){
        return vending;
    }

    // Выбор напитка
    public Drink findDrink(String nameDrink){
        for (Drink drink:vending) {
            if(nameDrink.equals(drink.getDrinkName())){
                return drink;
            }
        }
        return null;
    }

    public double getCash(){
        return cash;
    }

    // Механизм продажи напитка
    public Drink soldDrink(String nameDrink){
        Drink founded = findDrink(nameDrink);
        if(founded != null){
            cash = cash + founded.getDrinkPrice();
            vending.remove(founded);
        }
        return founded;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Денег в аппарате: ").append(cash).append("\n");
        for (Drink drink:vending) {
            builder.append(drink).append("\n");

        }
        return builder.toString();
    }


}
