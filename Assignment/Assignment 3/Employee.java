/*
Class:CSE1322L
Section:WJ1 Java
Term: Spring 2022
Instructor: Leul Endashaw
Name: Taylor Goff
assignment3
*/
public class Employee {

    private String fullName;
    private int employeeID;
    private static int numberOfEmployees = 0;

    public Employee(){ //default constructor
        fullName = "new employee" ;
        employeeID = ++numberOfEmployees;
    }

    Employee(String name){ //overloaded constructor to assign name
        fullName = name;
        employeeID = ++numberOfEmployees;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public static void decreaseNumberOfEmployees() {
        Employee.numberOfEmployees = numberOfEmployees - 1;
    }
}

