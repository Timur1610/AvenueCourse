package lessons;

import java.util.Scanner;

public class SecondLessons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Введите ваш возраст: ");
        //int num1 = scanner.nextInt();
        //System.out.println("Ваш возраст - " + num1);



        //System.out.println("Введите вашу дату рождения: ");

        //System.out.print("День - ");
        //int day = scanner.nextInt();

        //System.out.print("Месяц - ");
        //int mounth = scanner.nextInt();

        //System.out.print("Год - ");
        //int year = scanner.nextInt();
        //System.out.println(day + "." + mounth + "." + year);



        //System.out.print("Введите ваше имя: ");
        //String name = scanner.next();

        //System.out.print("Введите ваш возраст: ");
        //int age = scanner.nextInt();

        //System.out.println("\n" + "Ваше имя - " + name + "\n" + "Ваш возраст - " + age);


        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        double minus = num1 - num2;
        double mult = num1 * num2;
        double div = num1 / num2;
        double div2 = num1 % num2;
        System.out.println(sum);
        System.out.println(minus);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(div2);


//        int num1 = 13;
//        if (num1 > 13){
//            System.out.println("Число = 12");
//        } else if (num1 == 14) {
//            System.out.println("Число = 13");
//        } else if (num1 == 15) {
//            System.out.println("Число = 13");
//        } else{
//            System.out.println("Число ≠ 12");
//        }


//        int num2 = 12;
//        num2 += 8;
//        num2++;
//        num2--;
//        System.out.println(num2);

//        int num1 = 12;
//        if(num1 > 13 || num1 == 12){
//            System.out.println("Что-то");
//        }
//        else {
//            System.out.println("Ничего");
//        }


//        int num1 = 12;
//        switch (num1){
//            case 10 :
//                System.out.println("10");
//                break;
//            case 11 :
//                System.out.println("11");
//                break;
//            case 12 :
//                System.out.println("12");
//                break;
//            case 13 :
//                System.out.println("13");
//                break;
//            case 14 :
//                System.out.println("14");
//                break;
//        }

//        Scanner scanner = new Scanner(System.in);
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        int sum = num2 + num1;
//
//        if (sum > 20){
//            System.out.println(sum);
//        } else if (sum < 20) {
//            System.out.println(num1 - num2);
//        } else {
//            System.out.println("Привет!");
//        }

    }
}
