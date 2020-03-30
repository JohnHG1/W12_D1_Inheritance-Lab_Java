package Staff.management;

import Staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String natInsurance, int salary, String deptName){
        super(name, natInsurance, salary);
        this.deptName = deptName;
    }
    public String getDeptName(){
        return this.deptName;
    }


}