package homeWork.homeWork6.task2;

import homeWork.homeWork6.task2.Car;

public class Truk extends Car {
    private String driver;

    public Truk(String driver) {
        this.driver = driver;
    }

    @Override
    public void acceleration() {
        System.out.println("Разгон грузовика до 100 км/ч за 9 секунд");
    }

    @Override
    public void stop() {
        System.out.println("Полная грузовика остановка за 6 секунд");
    }

    public void gender(){
        System.out.printf("Водитель грузовика - мужчина, его имя %s\n\n", driver);
    }
}
