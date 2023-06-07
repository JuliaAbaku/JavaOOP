package homework1;

public class Water extends Drink{

    private String type;
    private double volume;

    public Water (String drinkName, Double drinkPrice, String type, double volume){
        super(drinkName, drinkPrice);
        this.type = type;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("Вода: %s, Тип: %s, Объем: %f", super.toString(), type, volume);
    }

}
