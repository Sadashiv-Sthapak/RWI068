//polymorphism

class Employee {
    
    public void calculateSalary() {
        System.out.println("Calculating salary for a generic employee");
    }
}


class Manager extends Employee {
    
    @Override
    public void calculateSalary() {
        System.out.println("Calculating salary for a Manager");
    }
}


class Developer extends Employee {
  
    @Override
    public void calculateSalary() {
        System.out.println("Calculating salary for a Developer");
    }
}


public class oops4 {
    public static void main(String[] args) {
        
        Employee manager = new Manager();
        Employee developer = new Developer();

        // Polymorphism
        manager.calculateSalary();
        developer.calculateSalary();
    }
}
