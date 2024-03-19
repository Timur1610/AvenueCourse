package homeWork.homeWork7;

public class Tour{
    private String country;
    private int countDays;
    private String transport;
    private int price;

    public Tour(String country, int countDays, String transport, int price) {
        this.country = country;
        this.countDays = countDays;
        this.transport = transport;
        this.price = price;
    }

    public Tour(int countDays, int price) {
        this.countDays = countDays;
        this.price = price;
    }

    public Tour() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCountDays() {
        return countDays;
    }

    public void setCountDays(int countDays) {
        this.countDays = countDays;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "country='" + country + '\'' +
                ", countDays=" + countDays +
                ", transport='" + transport + '\'' +
                ", price=" + price +
                '}';
    }
}
