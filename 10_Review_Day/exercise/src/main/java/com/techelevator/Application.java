package com.techelevator;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    /**
     * The main entry point in the application
     *
     * @param args
     */
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    private void run() {
        // create some departments
        createDepartments();

        // print each department by name
        printDepartments();

        // create employees
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!

        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();
    }

    /**
     * Create departments and add them to the collection of departments
     */
    List<Department> departments = new ArrayList<Department>();

    private void createDepartments() {
        departments.add(new Department(1, "Marketing"));
        departments.add(new Department(2, "Sales"));
        departments.add(new Department(3, "Engineering"));
    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
        for (Department deptList : departments) {
            System.out.println(deptList.getName());
        }

    }

    /**
     * Create employees and add them to the collection of employees
     */
    List<Employee> employees = new ArrayList<>();

    private void createEmployees() {
        //LocalDate hDate = LocalDate.now();
        Employee deanJohnson = new Employee();
        deanJohnson.setEmployeeId(1);
        deanJohnson.setFirstName("Dean");
        deanJohnson.setLastName("Johnson");
        deanJohnson.setEmail("djohnson@teams.com");
        deanJohnson.setSalary(60000.0);
        deanJohnson.setDepartment(getDepartment_Name("Engineering"));
        deanJohnson.setHireDate("08/21/2020");
        Department department = null;
        for (Department department1 : departments) {
            if (department1.getName().equals("Engineering")) {
                department = department1;
                break;
            }
        }
        deanJohnson.setDepartment(department);
        employees.add(deanJohnson);
        employees.add(new Employee(2, "Angie", "Smith", "asmith@teams.com", getDepartment_Name("Engineering"), "08/21/2020"));
        employees.add(new Employee(3, "Margaret", "Thompson", "mthompson@teams.com", getDepartment_Name("Marketing"), "08/21/2020"));
    }

    // Pass Department
    private Department getDepartment_Name(String name) {
        for (Department department : departments) {
            if (department.getName().equals(name)) {return department;}
        }
        return null;
    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        //employees.get(1).raiseSalary(10);
        for (Employee employee : employees) {
            if (employee.getFirstName().equals("Angie")) {
                employee.raiseSalary(10);
                break;
            }
        }

        NumberFormat currency = NumberFormat.getCurrencyInstance(); //Bonus challenges - Employee salary formatting
        System.out.println("\n------------- EMPLOYEES ------------------------------");
        for (Employee employeeList : employees) {
            System.out.println(employeeList.getFullName()
                    + "\t\t\t(" + currency.format(employeeList.getSalary() )+ ")\t\t" + employeeList.getDepartment().getName());
        }
    }

    /**
     * Create the 'TEams' project.
     */
    Map<String, Project> projects = new HashMap<String, Project>();
    private void createTeamsProject() {
        Project projectDetail = new Project("TEams", "Project Management Software", "10/10/2020", "11/10/2020");
        List<Employee> projectMembers = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getDepartment().getName().equals("Engineering")) {
                projectMembers.add(employee);
            }
        }
        projectDetail.setTeamMembers(projectMembers);
        projects.put("TEams", projectDetail);
    }
    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {
        Project projectDetail = new Project("Marketing Landing Page", "Lead Capture Landing Page for Marketing", "10/10/2020", "11/10/2020");
        List<Employee> projectMembers = new ArrayList<Employee>();
        for (Employee employee : employees) {
            if (employee.getDepartment().getName().equals("Marketing")) {
                projectMembers.add(employee);
            }
        }
        projectDetail.setTeamMembers(projectMembers);
        projects.put("Marketing Landing Page", projectDetail);
    }
//    Map<String, Project> projects = new HashMap<String, Project>();
    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");
        for(Project projectReport: projects.values()){
            System.out.println(projectReport.getName()+": "+ projectReport.getTeamMembers().size());
        }
    }
}