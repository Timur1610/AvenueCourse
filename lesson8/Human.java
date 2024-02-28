package lesson8;

public abstract class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public abstract void display();

    public String getName() {
        return name;
    }

}
