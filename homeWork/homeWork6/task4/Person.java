package homeWork.homeWork6.task4;

/**
 * Создать класс Person, который содержит:
 * 1) переменные fullName, age;
 * 2) методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит" и "Такой-то  Person двигается".
 * 3) Добавьте два конструктора  - Person() и Person(fullName, age).
 * 4) Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
 * 5) Вызовите методы move() и talk().
 */
public class Person {
    private String fullName;
    private int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        System.out.println("Такой-то Person говорит");
    }
    public void talk(){
        System.out.println("Такой-то Person двигается");
    }
}
