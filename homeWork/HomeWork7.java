package homeWork;

public class HomeWork7 {
    public static void main(String[] args) {
        String str1 = "{Hello?my_little+friend&i:really^miss%you|";
        char[] chars = str1.toCharArray();
        for (char ch : chars) {
            if ((ch >= 48) && (ch <= 57) || (ch >= 65) && (ch <= 90) || (ch >= 97) && (ch <= 122)) {
                String str = new String(new char[]{ch});
                System.out.print(str);
            } else {
                System.out.println(" ");
            }
        }
    }
}
