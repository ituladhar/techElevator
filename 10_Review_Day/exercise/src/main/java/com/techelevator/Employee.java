package com.techelevator;

import java.time.LocalDate;

public class Employee {
    private long employeeId;
    private String firstName;
    private String lastName;
    private  String email;
    private double salary;
    private Department department;
    private String hireDate;
    private final double STARTING_SALARY = 60000;



    //<editor-fold desc="Constructors, Getters and Setters">
    public Employee(long employeeId, String firstName, String lastName, String email, Department department, String hireDate) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.hireDate = hireDate;
        this.salary = STARTING_SALARY;
    }

    public Employee() {

    }

//    public Employee() {
//    }

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
          return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getHireDate(LocalDate hDate) {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public double getSTARTING_SALARY() {
        return STARTING_SALARY;
    }
    //</editor-fold>

    //Method
    public void raiseSalary(double percent){
        this.salary = this.salary* (1 + (percent/100.0));
        }

    public String getFullName(){
        return lastName+", "+firstName;
    }



}
