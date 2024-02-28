package homeWork.homeWork5;

public class Animal {
    private String name;
    private String ownerName;
    private int weight;
    private int height;

    public Animal(String name, String ownerName, int weight, int height) {
        this.name = name;
        this.ownerName = ownerName;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
