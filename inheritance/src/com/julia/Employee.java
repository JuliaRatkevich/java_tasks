package com.julia;

abstract public class Employee {

    protected int id;
    protected String name;
    protected String  companyName;
    protected int basicSalary;


    public int getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public Employee(int id, String name, String companyName, int basicSalary) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.basicSalary = basicSalary;
    }

    public abstract int getMonthlySalary();

}
