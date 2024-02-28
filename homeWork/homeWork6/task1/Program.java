package homeWork.homeWork6.task1;

import homeWork.homeWork6.task1.Phone;

public class Program {
    public static void main(String[] args) {
        Phone iphone = new Phone("+79876545739", "IPhone", 0.25);
        Phone samsung = new Phone("+79876288739", "Samsung", 0.4);
        Phone honor = new Phone("+79600396711", "Honor", 0.31);
        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(honor);

        iphone.receiveCall("Максим");
        samsung.receiveCall("Антон");
        honor.receiveCall("Алексей");

    }
}
