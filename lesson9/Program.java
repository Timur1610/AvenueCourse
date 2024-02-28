package lesson9;

public class Program {
    public static void main(String[] args) {
//        Day currentDay = Day.monday;
//        System.out.println(currentDay);

//        Book book1 = new Book(Type.history, "Древний Рим", "Какой - то греческий автор");
//        System.out.println(book1.name + " " + book1.author + " " + book1.getType()) ;
//        Type[] types = Type.values();
//        for (Type elem:types) {
//            System.out.println(elem);
//        }
//        System.out.println(Color.RED.getColorCode());
//        System.out.println(Color.BLUE.getColorCode());

        Operations operations = Operations.MULT;
        System.out.println(operations.action(12, 3));


    }

}
