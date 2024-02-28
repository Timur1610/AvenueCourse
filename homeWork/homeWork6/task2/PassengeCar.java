package homeWork.homeWork6.task2;

import homeWork.homeWork6.task2.Car;

public class PassengeCar extends Car {

    private String driver;

    public PassengeCar(String driver) {
        this.driver = driver;
    }

    @Override
    public void acceleration() {
        System.out.println("Разгон легкового автомобиля до 100 км/ч за 3 секунды");
    }

    @Override
    public void stop() {
        System.out.println("Полная остановка легкового автомобиля за 5 секунд");
    }

    public void gender (){
        System.out.printf("Водитель легкового автомобиля - женщина, ее имя %s\n\n", driver);
    }
}
