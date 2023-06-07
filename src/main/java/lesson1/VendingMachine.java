package lesson1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> vending = new ArrayList<>();
    private double cash = 0;

    public VendingMachine addProduct(Product prod){
        vending.add(prod);
        return this;
    }

    public List<Product> getVending() {
        return vending;
    }

    public Product findProduct(String name){
        for (Product product:vending) {
            if(name.equals(product.getProductName())) {
                return product;
            }
        }
        return null;
    }

    public double getCash() {
        return cash;
    }
    public Product saleProduct(String nameProduct){
        Product founded = findProduct(nameProduct);
        if(founded != null){
            cash = cash + founded.getProductPrice();
            vending.remove(founded);
        }
        return founded;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Денег в аппарате: ").append(cash).append("\n");
        for (Product product:vending) {
            builder.append(product).append("\n");

        }
        return builder.toString();
    }
}
