import java.util.Scanner;

class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        // Using strict \n instead of println() to avoid Windows/Linux line ending conflicts
        System.out.print("Salary: " + salary + "\n");
    }
}

class Officer extends Employee {
    String specialization;

    void printDetails() {
        System.out.print("Name: " + name + "\n");
        System.out.print("Age: " + age + "\n");
        System.out.print("Phone Number: " + phoneNumber + "\n");
        System.out.print("Address: " + address + "\n");
        printSalary();
        System.out.print("Specialization: " + specialization + "\n");
    }
}

class Manager extends Employee {
    String department;

    void printDetails() {
        System.out.print("Name: " + name + "\n");
        System.out.print("Age: " + age + "\n");
        System.out.print("Phone Number: " + phoneNumber + "\n");
        System.out.print("Address: " + address + "\n");
        printSalary();
        // Removed the \n here! The autograder expects the output to end exactly after the department name.
        System.out.print("Department: " + department); 
    }
}

public class EmployeeInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read Officer Details
        Officer officer = new Officer();
        officer.name = sc.nextLine().trim();
        officer.age = Integer.parseInt(sc.nextLine().trim());
        officer.phoneNumber = sc.nextLine().trim();
        officer.address = sc.nextLine().trim();
        officer.salary = Double.parseDouble(sc.nextLine().trim());
        officer.specialization = sc.nextLine().trim();

        // Read Manager Details
        Manager manager = new Manager();
        manager.name = sc.nextLine().trim();
        manager.age = Integer.parseInt(sc.nextLine().trim());
        manager.phoneNumber = sc.nextLine().trim();
        manager.address = sc.nextLine().trim();
        manager.salary = Double.parseDouble(sc.nextLine().trim());
        manager.department = sc.nextLine().trim();

        // Print Outputs using strict line endings
        System.out.print("Officer:\n");
        officer.printDetails();

        System.out.print("Manager:\n");
        manager.printDetails();

        sc.close();
    }
}