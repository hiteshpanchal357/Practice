package BankInheritance;

public class Manager extends Employee {

    public Manager(int id, String name, double salary) {

        super(id, name, salary);
    }

    @Override

    public double calculateBonus() {
        return salary * 0.20;

    }

}
