import java.util.Scanner;

class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary; // Reverted to double for the .0 decimal

    void printSalary() {
        System.out.println(salary);
    }
}

class Officer extends Employee {
    String specialization;

    void displayOfficer() {
        System.out.println("Officer:");
        System.out.println(name);
        System.out.println(age);
        System.out.println(phoneNumber);
        System.out.println(address);
        printSalary();
        System.out.println(specialization);
    }
}

class Manager extends Employee {
    String department;

    void displayManager() {
        System.out.println("Manager:");
        System.out.println(name);
        System.out.println(age);
        System.out.println(phoneNumber);
        System.out.println(address);
        printSalary();
        System.out.println(department);
    }
}

public class EmployeeInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Officer off = new Officer();
        off.name = sc.nextLine();
        off.age = sc.nextInt();
        sc.nextLine(); 
        off.phoneNumber = sc.nextLine();
        off.address = sc.nextLine();
        off.salary = sc.nextDouble(); // Read as double
        sc.nextLine(); 
        off.specialization = sc.nextLine();

        Manager mng = new Manager();
        mng.name = sc.nextLine();
        mng.age = sc.nextInt();
        sc.nextLine(); 
        mng.phoneNumber = sc.nextLine();
        mng.address = sc.nextLine();
        mng.salary = sc.nextDouble(); // Read as double
        sc.nextLine(); 
        mng.department = sc.nextLine();

        off.displayOfficer();
        mng.displayManager();
        
        sc.close();
    }
}