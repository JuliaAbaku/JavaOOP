package lesson1;

public class Cheese extends Product{
    private String cheeseType;
    private double cheeseWeight;

    public Cheese(String productName, Double productPrice, String cheeseType, double cheeseWeight) {
        super(productName, productPrice);
        this.cheeseType = cheeseType;
        this.cheeseWeight = cheeseWeight;
    }

    @Override
    public String toString() {
        return String.format("Сыр: %s, Тип: %s, Вес: %f", super.toString(), cheeseType, cheeseWeight);
    }
}
