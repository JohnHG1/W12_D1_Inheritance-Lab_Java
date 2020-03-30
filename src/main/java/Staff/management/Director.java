package Staff.management;

import Staff.management.Manager;

public class Director extends Manager {
    private double budget;
    public Director(String name, String natInsurance, int salary, String deptName, double budget) {
        super(name, natInsurance, salary, deptName);
        this.budget = budget;
    }
    public double getBudget(){
        return this.budget;
    }


    @Override
    public double payBonus() {
        return this.getSalary() /100 * 2 ;
    }
}