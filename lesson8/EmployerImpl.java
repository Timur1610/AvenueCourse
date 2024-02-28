package lesson8;

public class EmployerImpl extends Human{
    private String position;
    private int exp;

    public EmployerImpl(String name, String position, int exp) {
        super(name);
        this.position = position;
        this.exp = exp;
    }

    @Override
    public void display() {
        System.out.println(getName());
        System.out.println(position);
        System.out.println(exp);
    }
}
