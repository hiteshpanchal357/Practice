public class Employee {

    // private fields -- Encapsulation
    private int id;
    private String name;
    private double salary;

    // constructor
    public Employee(int id, String name, double salary) {

        this.id = id;
        this.name = name;

        // validation
        if (salary > 0) {
            this.salary = salary;
        } else {
            this.salary = 0;
            System.out.println("Invalid Salary");
        }
    }

    // Getter methods

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setter method

    public void setSalary(double salary) {

        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount ");

        }

    }

    // display method

    public void displayEmployee() {

        System.out.println("Id " + id);
        System.out.println("Name " + name);
        System.out.println("Salary " + salary);
    }

    public static void main(String[] args) {

        Employee E1 = new Employee(101, "Hitesh", 5000);
        E1.setSalary(100);
        E1.displayEmployee();
         System.out.println(E1.getId());
        // testing validation

    }
}