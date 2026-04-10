import java.util.Scanner;

// Parent Class
class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    int salary;

    // Method to print only the salary as requested
    void printSalary() {
        System.out.println(salary);
    }
}

// Subclass Officer inherits from Employee
class Officer extends Employee {
    String specialization;

    void displayOfficer() {
        System.out.println("\nOfficer:");
        System.out.println(name);
        System.out.println( age);
        System.out.println( phoneNumber);
        System.out.println( address);
        printSalary(); // Calling method from parent class
        System.out.println( specialization);
    }
}

// Subclass Manager inherits from Employee
class Manager extends Employee {
    String department;

    void displayManager() {
        System.out.println("Manager:");
        System.out.println( name);
        System.out.println( age);
        System.out.println( phoneNumber);
        System.out.println(address);
        printSalary(); // Calling method from parent class
        System.out.println(department);
    }
}

public class EmployeeInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Assigning values to Officer
        Officer off = new Officer();
        off.name = sc.nextLine();
        off.age = sc.nextInt();
        sc.nextLine(); // Consume newline
        off.phoneNumber = sc.nextLine();
        off.address = sc.nextLine();
        off.salary = sc.nextInt();
        sc.nextLine(); // Consume newline
        off.specialization = sc.nextLine();

        // Assigning values to Manager
        Manager mng = new Manager();
        mng.name = sc.nextLine();
        mng.age = sc.nextInt();
        sc.nextLine(); // Consume newline
        mng.phoneNumber = sc.nextLine();
        mng.address = sc.nextLine();
        mng.salary = mng.salary = sc.nextInt();
        sc.nextLine(); // Consume newline
        mng.department = sc.nextLine();

        // Printing Details
        off.displayOfficer();
        mng.displayManager();
        
        sc.close();
    }
}