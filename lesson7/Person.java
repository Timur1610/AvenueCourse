package lesson7;

public class Person {
    String name;
    protected String surname;
    private String adress;
    public int age;


    public Person(String name, String surname, String adress, int age) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void displayName(){
        System.out.println("Name: " + name);
    }
    void displaySurname(){
        System.out.println("Surname: " + surname);
    }
    private void displayAge(){
        System.out.println("Age: " + age);
    }
    protected void displayAdres(){
        System.out.println("Adress: " + adress);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
