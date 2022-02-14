/*
Class:CSE1322L
Section:WJ1 Java
Term: Spring 2022
Instructor: Leul Endashaw
Name: Taylor Goff
assignment3
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Faculty> facultyList = new ArrayList<>();
//    Employee e1 = new Employee();
//    Faculty f1 = new Faculty();

    public static void addFaculty(ArrayList<Faculty> facultyList) {
        Scanner sc = new Scanner(System.in);
        String name;
        double salary;
        double stipend;

        System.out.println("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.println("Enter Weekly Salary: ");
        salary = sc.nextDouble();
        System.out.println("Enter Weekly Stipend: ");
        stipend = sc.nextDouble();

        Faculty f1 = new Faculty(name, salary, stipend); //create faculty object
        //f1.setFullName(name); //sets faculty object 1's name
        //f1.setWeeklySalary(salary); //sets faculty object 1's salary
        //f1.setWeeklyStipend(stipend); //sets faculty object 1's stipend

        facultyList.add(f1); //adds faculty object to the facultylist arraylist
    }

    public static void removeFaculty(ArrayList<Faculty> facultyList) {
        Scanner sc = new Scanner(System.in);
        String name;

        System.out.println("Enter Employee Name: ");
        name = sc.nextLine();
        boolean Found = false;

        //search for name in array list, if found remove it,
        for (Faculty x : facultyList) {
            if( x.getFullName().contains(name)){ //x.getFullName() != null && x.getFullName().contains(name)
                int index = facultyList.indexOf(x);
                facultyList.remove(index);
                Employee.decreaseNumberOfEmployees();//removes one count from employee
                Found = true;
        }
            }
        //if(Found == false){System.out.println("Error: name not found");}

        //        if (lists.contains(name)) {
//            int index = lists.indexOf(name);
//            lists.remove(index);
//            Employee.decreaseNumberOfEmployees(); //removes one count from employee
//        } else { System.out.println("Error: name not found"); }
//    }
        }




    public static void calculateFacultyPay(ArrayList<Faculty> facultyList) {
        //go through each object and use the calculateWeeklyPay method for each index

        for (Faculty x : facultyList) {
            x.calculateWeeklyPay();
        }
    }

    public static void printFaculty(ArrayList<Faculty> facultyList){ // print out each object in faculty list

        for (Faculty x : facultyList) {
            System.out.println(x);
        }
        System.out.println();
    }

//        for (Faculty x : lists) {
//            System.out.println(facultyList.toString().replaceAll("[\\[\\]]", ""));
//        }
//    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userChoice;

        do {
            System.out.println("1 – Add Faculty\n" +
                    "2 – Delete Faculty\n" +
                    "3 – Calculate Faculty Pay\n" +
                    "4 – Print Faculty\n" +
                    "5 – Exit\n");
            System.out.print("Enter Choice: ");
            userChoice = sc.nextInt();
            String none = sc.nextLine();
            System.out.print("\n");


            switch (userChoice) {

                case 1:
                    addFaculty(facultyList); break;
                    //    System.out.println();
                case 2:
                    removeFaculty(facultyList); break;
                case 3:
                    calculateFacultyPay(facultyList); break;
                case 4:
                   printFaculty(facultyList); break;
                default: System.out.println("Error: Please enter valid input\n");
            }

        } while (userChoice != 5);

    }

    }

