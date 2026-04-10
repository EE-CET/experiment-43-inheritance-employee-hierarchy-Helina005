import java.util.Scanner;

class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        // Casting to int to match the expected format (e.g., "Salary: 25000" instead of "Salary: 25000.0")
        System.out.println("Salary: " + (int)salary);
    }
}

class Officer extends Employee {
    String specialization;

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Employee {
    String department;

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Department: " + department);
    }
}

// CHANGED THIS LINE: The class name now matches your filename (EmployeeInheritance.java)
public class EmployeeInheritance { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read Officer Details
        Officer officer = new Officer();
        officer.name = sc.nextLine();
        officer.age = Integer.parseInt(sc.nextLine());
        officer.phoneNumber = sc.nextLine();
        officer.address = sc.nextLine();
        officer.salary = Double.parseDouble(sc.nextLine());
        officer.specialization = sc.nextLine();

        // Read Manager Details
        Manager manager = new Manager();
        manager.name = sc.nextLine();
        manager.age = Integer.parseInt(sc.nextLine());
        manager.phoneNumber = sc.nextLine();
        manager.address = sc.nextLine();
        manager.salary = Double.parseDouble(sc.nextLine());
        manager.department = sc.nextLine();

        // Print Outputs
        System.out.println("Officer:");
        officer.printDetails();

        System.out.println("Manager:");
        manager.printDetails();

        sc.close();
    }
}