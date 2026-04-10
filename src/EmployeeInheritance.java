import java.util.Scanner;

class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Officer extends Employee {
    String specialization;
}

class Manager extends Employee {
    String department;
}

public class EmployeeInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Officer officer = new Officer();
        Manager manager = new Manager();

        // Officer details
        officer.name = sc.nextLine();
        officer.age = Integer.parseInt(sc.nextLine());
        officer.phoneNumber = sc.nextLine();
        officer.address = sc.nextLine();
        officer.salary = Double.parseDouble(sc.nextLine());
        officer.specialization = sc.nextLine();

        // Manager details
        manager.name = sc.nextLine();
        manager.age = Integer.parseInt(sc.nextLine());
        manager.phoneNumber = sc.nextLine();
        manager.address = sc.nextLine();
        manager.salary = Double.parseDouble(sc.nextLine());
        manager.department = sc.nextLine();

        // Output Officer details
        System.out.println("Officer");
        System.out.println("Name: " + officer.name);
        System.out.println("Age: " + officer.age);
        System.out.println("Phone Number: " + officer.phoneNumber);
        System.out.println("Address: " + officer.address);
        officer.printSalary();
        System.out.println("Specialization: " + officer.specialization);

        // Output Manager details
        System.out.println("Manager");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        manager.printSalary();
        System.out.println("Department: " + manager.department);

        sc.close();
    }
}