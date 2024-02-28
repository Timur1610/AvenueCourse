package lesson8;

public class Magazine implements Printable{

    String nameOfMagazine;

    public Magazine(String nameOfMagazine) {
        this.nameOfMagazine = nameOfMagazine;
    }

    @Override
    public void print() {
        System.out.println(nameOfMagazine);
    }
}
