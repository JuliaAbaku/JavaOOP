package lesson1;

public class Main {
    public static void main(String[] args) {

        VendingMachine apparat = new VendingMachine();
        apparat.addProduct(new Chocolate("Alpen Gold", 10.00, "тёмный", "с орехом", 100))
                .addProduct(new Product("Вода", 5.00))
                .addProduct(new Product("Бутерброд", 20.00))
                .addProduct(new Cheese("Российский", 70.00, "Твердый", 200.00));

//        for (Product product: apparat.getVending()) {
//            System.out.println(product);
//        }
        System.out.println(apparat);

        System.out.println("--------------------------");

        Product product = apparat.findProduct("Alpen Gold");
        System.out.println(product);

        System.out.println("--------------------------");

        Product soldProduct = apparat.saleProduct("Вода");
        System.out.println("Продажа: ");
        System.out.println(soldProduct);
        Product soldProduct2 = apparat.saleProduct("Бутерброд");
        System.out.println("Продажа: ");
        System.out.println(soldProduct2);
        System.out.println("Осталось денег: ");
        System.out.println(apparat.getCash());

//        for (Product product1: apparat.getVending()) {
//            System.out.println(product1);
//        }

        System.out.println(apparat);
    }

    

}
