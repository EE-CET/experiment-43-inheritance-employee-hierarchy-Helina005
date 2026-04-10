import java.util.Scanner;

class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        // Removed the (int) cast. Now it will print 50000.0 instead of 50000
        System.out.println("Salary: " + salary);
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

        // Print Outputs
        System.out.println("Officer:");
        officer.printDetails();

        System.out.println("Manager:");
        manager.printDetails();

        sc.close();
    }
}