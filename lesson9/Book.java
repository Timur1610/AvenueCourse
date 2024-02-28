package lesson9;

public class Book {
    Type bookType;
    String name;
    String author;

    public Book(Type bookType, String name, String author) {
        this.bookType = bookType;
        this.name = name;
        this.author = author;
    }

    public String getType() {
        switch (bookType) {
            case fantasy -> {
                return "Фэнтэзи";
            }
            case history -> {
                return "История";
            }
            case detective -> {
                return "Детектив";
            }
            case comedy -> {
                return "Комедия";
            }

        }
        return "Ничего";

    }
}