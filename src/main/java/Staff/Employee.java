package Staff;

public abstract class Employee {

    private String name;
    private String natInsurance;
    private double salary;

    public Employee(String name, String natInsurance, double salary) {
        this.name = name;
        this.natInsurance = natInsurance;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNatInsurance() {
        return natInsurance;
    }

    public double getSalary() {
        return salary;
    }

    public double salaryRaise(double amount) {
        if (amount <= 0) {
        } else {
            this.salary = this.salary + amount;
        }

        double payBonus;
            return this.salary * 0.01;
        }
    }


