package lesson7;

public class Human {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0 && age < 150 ){
            this.age = age;
        }
    }

    public Human(String name, int age) {
        this.name = name;
        if(age > 0 && age < 150 ){
            this.age = age;
        }
    }
}
