package session12.bai1;

public abstract class Staff implements ICapability {
    protected int id;
    protected String name;
    protected double baseSalary;

    public Staff(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getId() {
        return id;
    }

    public abstract double calculateTotalSalary();

    public void display() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", Total Salary: " + calculateTotalSalary());
    }
}

