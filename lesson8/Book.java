package lesson8;

public class Book implements Printable{
    String nameOfBook;
    String author;

    public Book(String nameOfBook, String author) {
        this.nameOfBook = nameOfBook;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println(nameOfBook + " " + author);
    }


}
