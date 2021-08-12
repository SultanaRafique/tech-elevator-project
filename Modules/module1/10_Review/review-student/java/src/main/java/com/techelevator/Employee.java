package com.techelevator;

import java.time.LocalDate;

public class Employee {

    private long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private double salary ;
    private Department department;
    private LocalDate hireDate;
    public static final double DEFAULT_SALARY = 60_000;

    public Employee(){

    }

    public Employee(long employeeId, String firstName,
                    String lastName, String email, Department department, LocalDate hireDate) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.hireDate = hireDate;
        this.salary = DEFAULT_SALARY;
    }

    public long getEmployeeId() {

        return employeeId;
    }

    public void setEmployeeId(long employeeId) {

        this.employeeId = employeeId;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public double getSalary() {

        return this.salary;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    public Department getDepartment() {

        return department;
    }

    public void setDepartment(Department department) {

        this.department = department;
    }

    public LocalDate getHireDate() {

        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {

        this.hireDate = hireDate;
    }

    public String getFullName(){

        return getLastName() + ", " + getFirstName();
    }

    public void raiseSalary (double percent){

        salary = getSalary() + getSalary() * percent;

    }
}

