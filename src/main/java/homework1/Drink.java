package homework1;

public class Drink {

    private String drinkName;
    private Double drinkPrice;

    public Drink(String drinkName, Double drinkPrice){
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
    }

    @Override
    public String toString() {
        return String.format("Напиток: %s, Цена: %f", drinkName, drinkPrice);
    }

    public String getDrinkName() {
        return drinkName;
    }

    public Double getDrinkPrice() {
        return drinkPrice;
    }
}
