package lesson7;

public class NewHumanProgram {
    public static void main(String[] args) {
        NewHuman newHuman = new NewHuman("Anton", 12);
        System.out.println(newHuman.getName() + " " + newHuman.getAge());
        changeName(newHuman);
        System.out.println(newHuman.getName() + " " + newHuman.getAge());
    }

    static void changeName(NewHuman newHuman){
        newHuman.setName("Albert");
    }
}
