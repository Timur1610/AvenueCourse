package lesson9;

public class ObjectsEx {
    public static void main(String[] args) {
        Person person = new Person("Timur");
        Person person2 = new Person("Timur");
//        Person person3 = new Person("Anton");
//        System.out.println(person);
//        System.out.println(person.hashCode());
//        System.out.println(person.getClass());
        System.out.println(person.equals(person2));
    }
}
