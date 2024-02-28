package lesson10;

import java.util.Arrays;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
//        int[] nums = new int[]{43,54,23,765,3,12};
//        System.out.print(nums.length);

//        String string = "Hello world!";
//        System.out.println(string.length());
//
//        String string1 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
//        char[] chars = string1.toCharArray();
//        for (char ch: chars) {
//            System.out.println(ch);
//        }
//        System.out.println(chars);

//        String string = "Hello";
//        String string1 = "dear friend";
//        String string2 = string + string1;
//        System.out.println(string + string1 + string2);
//        String string3 = String.join(" ", string, string1);
//        System.out.println(string3);

//        String str1 = "Hello dear friend";
//        char[] chars = str1.toCharArray();
//        System.out.println(chars[4]);
//
//        char char1 = str1.charAt(4);
//        System.out.println(char1);


//        String str1 = new String("Hello");
//        String str2 = "hello";
//        System.out.println(str1 == str2);
//        System.out.println(str1.equalsIgnoreCase(str2));
//
//        String str4 = str1.toLowerCase();
//        System.out.println(str4.equalsIgnoreCase(str1));

//        String str1 = "Hello world!";
//        String str2 = "I am work!";
//        String str3 = "Welcome to hell!";
//        System.out.println(str1.regionMatches(0, str3, 11, 4));

//        String str1 = "Hello world";
//        System.out.println(str1.charAt(3));
//        System.out.println(str1.indexOf("lo"));

//        String str1 = "Hello my little pony!";
//        System.out.println((str1.toLowerCase()).startsWith("hello"));

//        String str2 = "qwerty@mail.ru";
//        String str3 = "qwerty@gmail.com";
//        System.out.println(str2.endsWith("gmail.com"));
//        System.out.println(str3.endsWith("gmail.com"));

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
