package lesson2;

public class Duck extends Bird implements RunSpeed, FlySpeed, SwimSpeed{

    public Duck(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Quaq-quaq";
    }

    @Override
    public String feed() {
        return "Всё подряд";
    }

    @Override
    public int getRunSpeed() {
        return 1;
    }

    @Override
    public String toString() {
        return String.format("Duck: %s, Speed: %d, FlySpeed: %d, SwimSpeed: %d", super.toString(), getRunSpeed(), getFlySpeed(), getSwimSpeed());
    }

    @Override
    public int getFlySpeed() {
        return 30;
    }

    @Override
    public int getSwimSpeed() {
        return 20;
    }
}
