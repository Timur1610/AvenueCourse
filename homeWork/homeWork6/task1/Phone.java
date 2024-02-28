package homeWork.homeWork6.task1;

/**
 * Задание 1
 * Класс Phone.
 *
 * 1) Создайте класс Phone, который содержит переменные number, model и weight.
 * 2) Создайте три экземпляра этого класса.
 * 3) Выведите на консоль значения их переменных.
 *
 * 4) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
 * Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
 *Вызвать эти методы для каждого из объектов.
 *
 * 5) Добавить конструктор в класс Phone,
 * который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
 *
 * 6) Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
 * 7) Добавить конструктор без параметров.
 */
public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name){
        System.out.printf("Звонит %s на номер %s\n", name, getNumber());
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
