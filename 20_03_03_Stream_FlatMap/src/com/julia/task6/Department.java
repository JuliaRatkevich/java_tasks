package com.julia.task6;
import java.util.List;

public class Department {
    String name;
    String code;
    List<Employee> employeeList;

    public Department(String name, String code, List<Employee> employeeList) {
        this.name = name;
        this.code = code;
        this.employeeList = employeeList;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}
