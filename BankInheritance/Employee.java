package BankInheritance;

public class Employee {
    
    protected int id ;
    protected String name;
    protected double salary;

    // constructor

    public Employee(int id , String name ,double salary){
        this.id = id;
        this.name = name;
        this.salary=salary;

    }

    public double calculateBonus(){
        return 0 ;
    }

    public void showDetails(){

        System.out.println("ID " + id);
        System.out.println("Name " + name);  
        System.out.println("Salary " + salary);
        System.out.println("Bonus "+ calculateBonus());

    }
}

 // Runtime Polymorphism

// Most asked interview question.

// Employee emp1 =
//         new Developer(...);

// Left side:

// Employee

// Reference type.

// Right side:

// Developer

// Actual object.

// When:

// emp1.calculateBonus();

// runs,

// Java checks actual object:

// Developer

// and calls Developer's method.

// This is:

// Runtime Polymorphism