package lesson8;

public class Employee extends Person{

    private String company;

    public Employee(String name, String surname, int age, String company) {
        super(name, surname, age);
        this.company = company;
    }

    public void display(){
        System.out.println(getName());
        System.out.println(company);
    }
}
