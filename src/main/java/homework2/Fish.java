package homework2;

public abstract class Fish {

    protected String name;

    public Fish(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Name: %s", name);
    }
}
