package session11.ra.entity;

import java.time.LocalDate;
import java.util.Scanner;

public class Project {
    private String projectId;
    private String projectName;
    private LocalDate startDate;
    private LocalDate endDate;
    private Employee[] employees;
    private Status status;

    public enum Status {
        PLANNING, RUNNING, FINISHED
    }

    public Project() {}

    public Project(String projectId, String projectName, LocalDate startDate,
                   LocalDate endDate, Employee[] employees, Status status) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.employees = employees;
        this.status = status;
    }

    public void inputData(Scanner scanner, Employee[] arrEmp) {
        System.out.print("Nhập mã dự án (P0001): ");
        this.projectId = scanner.nextLine();
        System.out.print("Nhập tên dự án: ");
        this.projectName = scanner.nextLine();
        System.out.print("Nhập ngày bắt đầu (yyyy-MM-dd): ");
        this.startDate = LocalDate.parse(scanner.nextLine());
        System.out.print("Nhập ngày kết thúc (yyyy-MM-dd): ");
        this.endDate = LocalDate.parse(scanner.nextLine());
        System.out.print("Nhập trạng thái (PLANNING/RUNNING/FINISHED): ");
        this.status = Status.valueOf(scanner.nextLine().toUpperCase());
        this.employees = arrEmp; // đơn giản: gán toàn bộ danh sách nhân viên
    }

    public void displayData() {
        System.out.printf("ID: %s | Tên: %s | Bắt đầu: %s | Kết thúc: %s | Trạng thái: %s\n",
                projectId, projectName, startDate, endDate, status);
        if (employees != null) {
            System.out.println("Danh sách nhân viên:");
            for (Employee emp : employees) {
                if (emp != null) emp.displayData();
            }
        }
    }

    // ===== Getter & Setter =====
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
