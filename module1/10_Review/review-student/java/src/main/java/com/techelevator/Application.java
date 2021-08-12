package com.techelevator;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.*;


public class Application {
    private final  List<Department> departments = new ArrayList<>();
    private final List<Employee> employees = new ArrayList<>();
    private final Map<String,Project> projects = new HashMap<>();

    /**
     * The main entry point in the application
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
        employees.get(1).raiseSalary(0.10);

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
    private void createDepartments() {
        Department marketing = new Department(1, "Marketing");
        departments.add(marketing);

        Department Sales = new Department(2, "Sales");
        departments.add(Sales);

        Department Engineering = new Department(3, "Engineering");
        departments.add(Engineering);

    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
        for(Department department : departments){
            System.out.println(department.getName());
        }

    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {
        LocalDate today = LocalDate.now();

        //*** Part of bonus challenge solution:
        Department engineering = getDepartmentByName("Engineering");
        Department marketing = getDepartmentByName("Marketing");
        //***
        
        // Employee #1 - using no args constructor
        Employee dean = new Employee();
        dean.setEmployeeId(1);
        dean.setFirstName("Dean");
        dean.setLastName("Johnson");
        dean.setEmail("djohnson@teams.com");
        dean.setDepartment(engineering);
        dean.setHireDate(today);
        dean.setSalary(Employee.DEFAULT_SALARY);


        // Employee #2 - using all args constructor
        //public Employee(long employeeId, String firstName,
        //                    String lastName, String email, Department department, String hireDate)
        Employee angie = new Employee(2,"Angie", "Smith",
                "asmith@teams.com",engineering ,today);

        // Employee #3 - using all args constructor
        Employee margaret = new Employee(3, "Margaret", "Thompson",
                "mthompson@teams.com",marketing,today);

        employees.add(dean);
        employees.add(angie);
        employees.add(margaret);

    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        for(Employee emp : employees){
            System.out.println(emp.getFullName() + " (" + currency.format(emp.getSalary())
            + ") " + emp.getDepartment().getName());
        }

    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {
        // Project #1 - TEams Project Management

        Project TEams = new Project("TEams"," Project Management Software",
                LocalDate.now(), LocalDate.now().plusDays(30));


        // add all employees where department is engineering to the teams project
        for(Employee emp : employees){
            if(emp.getDepartment().getName().equalsIgnoreCase("Engineering")){
                TEams.getTeamMembers().add(emp);
            }
        }



        // the key should be the name of the project
        projects.put("TEams", TEams);

    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {
        // Project #2 - Marketing Landing Page

        Project  marketingLandingPage = new Project("Marketing Landing Page",
                " Lead Capture Landing Page for Marketing",
                LocalDate.now().plusDays(31), LocalDate.now().plusDays(31).plusDays(7));



        // add all employees where department is marketing to the landing page project

        for(Employee emp : employees){
            if(emp.getDepartment().getName().equalsIgnoreCase("Marketing")){
                marketingLandingPage.getTeamMembers().add(emp);
            }
        }

        projects.put("marketingLandingPage", marketingLandingPage);

    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");

        Set<Map.Entry<String, Project>> entries = projects.entrySet();
        for(Map.Entry<String, Project> entry: entries){
            System.out.println(entry.getValue().getName() + ": " +
                    entry.getValue().getTeamMembers().size());

        }

    }

    
    /**
     * Bonus challenge: Find a department by name.
     */

    public Department getDepartmentByName(String deptName){
        Department dpmt = null;
        for(Department department: departments){
            if(department.getName().equalsIgnoreCase(deptName)){
                dpmt = department;
            }
        }

        return dpmt;
    }



}
