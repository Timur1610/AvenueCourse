package homeWork.homeWork6.task2;

/**
 * Создать класс «Сar», у которого будут два свойства и два метода (например, разогнаться и остановиться).
 * Используя наследованные, реализовать класс «Грузовой автомобиль» и «Легковой автомобиль».
 * В унаследованных классах добавь по одному свойству и одному методу.
 */
public abstract class Car {
    private String start;
    private String stop;

    public abstract void acceleration();
    public abstract void stop();
}
