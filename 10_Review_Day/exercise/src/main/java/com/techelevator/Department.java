package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Department extends Employee{
    private  int departmentId;
    private  String name;

    //<editor-fold desc="Constructors, Getters and Setters">
    public Department(int departmentId, String name) {
        this.departmentId = departmentId;
        this.name = name;
    }

    public Department() {
    }

    public int getDepartmentId() {return departmentId;    }
    public void setDepartmentId(int departmentId) {  this.departmentId = departmentId;    }
    public String getName() { return name;    }
    public void setName(String name) {this.name = name;    }
    //</editor-fold>

//    void displayDepartment(ArrayList<Department> list){
//        for(Department deptInfo: list){
//            System.out.println(deptInfo.name);
//        }
//
//    }
}
