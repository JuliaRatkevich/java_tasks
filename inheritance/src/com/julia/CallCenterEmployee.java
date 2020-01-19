package com.julia;

public class CallCenterEmployee extends Employee {

    private int monthlyHours;

    private final static int MONTHLY_HOURS = 176;

    public CallCenterEmployee(int id, String name, String companyName, int basicSalary) {
        super(id, name, companyName, basicSalary);
        this.monthlyHours = getMonthlySalary();
    }



   public int getMonthlySalary() {
        return getBasicSalary() * monthlyHours / MONTHLY_HOURS;
    }
}
