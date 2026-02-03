package session11.ra.entity;

import java.util.Scanner;

public class Employee {
    private String employeeId;
    private String employeeName;
    private Role role;
    private double salary;

    public enum Role {
        DEV, TESTER, PM, BA
    }

    public Employee() {}

    public Employee(String employeeId, String employeeName, Role role, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.role = role;
        this.salary = salary;
    }

    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

    public String getEmployeeName() { return employeeName; }
    public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }

    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public void inputData(Scanner scanner) {
        System.out.print("Nhập mã nhân viên (E0001): ");
        this.employeeId = scanner.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        this.employeeName = scanner.nextLine();
        System.out.print("Nhập vai trò (DEV/TESTER/PM/BA): ");
        this.role = Role.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Nhập lương: ");
        this.salary = Double.parseDouble(scanner.nextLine());
    }

    public void displayData() {
        System.out.printf("ID: %s | Tên: %s | Vai trò: %s | Lương: %.2f\n",
                employeeId, employeeName, role, salary);
    }
}

