package BankInheritance;

public class Main {
    
    public static void main(String[] args){

        Employee emp1 = new Developer(
            10001,
            "Hitesh",
            10000
        );

        Employee emp2 = new Manager(
            102,
            "Ram",
            20000
        );

        emp1.showDetails();
        emp2.showDetails();
    }
}
