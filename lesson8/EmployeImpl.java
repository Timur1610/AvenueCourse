package lesson8;

public class EmployeImpl extends Human{
    private String company;

    public EmployeImpl(String name, String company) {
        super(name);
        this.company = company;
    }

    @Override
    public void display() {
        System.out.printf("Name %s, company %s", getName(), company);
    }
}
