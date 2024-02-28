package homeWork.homeWork6.task2;

public class Program {
    public static void main(String[] args) {
        PassengeCar passengeCar = new PassengeCar("Анастасия");
        passengeCar.acceleration();
        passengeCar.stop();
        passengeCar.gender();

        Truk truk = new Truk("Артем");
        truk.acceleration();
        truk.stop();
        truk.gender();
    }
}
