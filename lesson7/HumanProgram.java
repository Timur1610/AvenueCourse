package lesson7;

public class HumanProgram {
    public static void main(String[] args) {
        Human human = new Human("Anton", -33);
        System.out.println(human.getAge());
        System.out.println(human.getName());
        human.setAge(-12);
        System.out.println(human.getAge());
        human.setName("Timur");
        System.out.println(human.getName());
    }
}
