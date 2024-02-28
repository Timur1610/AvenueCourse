package homeWork;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {

        // ЗАДАЧА №1
        int a1 = 3;
        int b1 = 5;
        int c1 = 2;
        int perimetr = a1 + b1 + c1; //Периметр треугольника
        System.out.println(perimetr);


        // ЗАДАЧА №2
        int widthRoom = 12;
        int lengthRoom = 20;
        double widthTable = 2.5;
        double lengthTable = 1.5;
        int perimetrRoom = widthRoom * lengthRoom;
        double perimetrTable = widthTable * lengthTable;
        int tablesInTheRoom = (int) (perimetrRoom / perimetrTable);
        System.out.println(tablesInTheRoom);


        // ЗАДАЧА №3
        int money = 1000; //Всего денег
        int snickersPrice = 35; //Цена сникерса
        double kandyPrice = 3.5; //Цена конфеты
        int maxCountSnickers = money/snickersPrice; //Максимальное количесво сникерсов на все денги
        int remainingMoneyAfterBuyingSnickers = money -(maxCountSnickers * snickersPrice); //Сдача после покупки сникерсов

        System.out.println(maxCountSnickers + " сникерсов");

        int maxCountKandy = (int) (remainingMoneyAfterBuyingSnickers / kandyPrice); //Максимальное количество конфет на сдачу
        System.out.println(maxCountKandy + " конфет");

        double theRemainingMoneyAfterAllPurchases = money - ((maxCountSnickers * snickersPrice) + (maxCountKandy * kandyPrice));
        System.out.println(theRemainingMoneyAfterAllPurchases + " рубля - оставшаяся сдача после всей покупки");


        // ЗАДАЧА №4
        int num = 7 ;
        if (num % 2 == 0){
            System.out.println("true");
        }else {
            System.out.println("false");
        }


        // ЗАДАЧА №5
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер первой стороны треугольника - ");
        int a = scanner.nextInt();
        System.out.print("Введите размер второй стороны треугольника - ");
        int b = scanner.nextInt();
        System.out.print("Введите размер третьей стороны треугольника - ");
        int c = scanner.nextInt();
        if (a + b <= c || a + c <= b || b + c <= a)
            System.out.println("Треугольника не существует");
        else if (a == b && b == c && a == c){
            System.out.println("Треугольник равносторонний");
        } else if (a == b || b == c || a == c) {
            System.out.println("Треугольник равнобедренный");
        }else {
            System.out.println("Треугольник разносторонний");
        }

    }
}
