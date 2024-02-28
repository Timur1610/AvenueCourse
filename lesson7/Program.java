package lesson7;

public class Program {
    public static void main(String[] args) {
        Person person = new Person("Timur", "Badretdinov", "Ametyevskaya", 21);
        person.displayName();
        person.displaySurname();
        person.displayAdres();

        System.out.println(person.name);
        System.out.println(person.surname);
        System.out.println(person.age);
        System.out.println(person.getAdress());
        person.setAdress("utu");
        System.out.println(person.getAdress());
    }
}
