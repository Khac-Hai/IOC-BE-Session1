package session11.ra.entity;

import session11.ra.entity.Employee;
import session11.ra.entity.Project;

import java.util.Scanner;

public class ProjectManagement {
    private static Employee[] employees = new Employee[100];
    private static int empCount = 0;
    private static Project[] projects = new Project[50];
    private static int projCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("================= QUẢN LÝ DỰ ÁN =================");
            System.out.println("1. Quản lý nhân viên");
            System.out.println("2. Quản lý dự án");
            System.out.println("3. Thoát");
            System.out.println("================================================");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    employeeMenu(scanner);
                    break;
                case 2:
                    projectMenu(scanner);
                    break;
                case 3:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 3);
    }

    private static void employeeMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("================= QUẢN LÝ NHÂN VIÊN =================");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Hiển thị danh sách nhân viên");
            System.out.println("3. Cập nhật thông tin nhân viên");
            System.out.println("4. Xóa nhân viên");
            System.out.println("5. Tìm kiếm nhân viên theo tên");
            System.out.println("6. Sắp xếp nhân viên theo lương giảm dần");
            System.out.println("7. Thoát");
            System.out.println("====================================================");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    Employee emp = new Employee();
                    emp.inputData(scanner);
                    employees[empCount++] = emp;
                    break;
                case 2:
                    for (int i = 0; i < empCount; i++) {
                        employees[i].displayData();
                    }
                    break;
                case 3:
                    System.out.print("Nhập ID nhân viên cần cập nhật: ");
                    String updateId = scanner.nextLine();
                    for (int i = 0; i < empCount; i++) {
                        if (employees[i].getEmployeeId().equals(updateId)) {
                            employees[i].inputData(scanner);
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Nhập ID nhân viên cần xóa: ");
                    String deleteId = scanner.nextLine();
                    for (int i = 0; i < empCount; i++) {
                        if (employees[i].getEmployeeId().equals(deleteId)) {
                            for (int j = i; j < empCount - 1; j++) {
                                employees[j] = employees[j + 1];
                            }
                            empCount--;
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.print("Nhập tên nhân viên cần tìm: ");
                    String name = scanner.nextLine();
                    for (int i = 0; i < empCount; i++) {
                        if (employees[i].getEmployeeName().contains(name)) {
                            employees[i].displayData();
                        }
                    }
                    break;
                case 6:
                    for (int i = 0; i < empCount - 1; i++) {
                        for (int j = i + 1; j < empCount; j++) {
                            if (employees[i].getSalary() < employees[j].getSalary()) {
                                Employee temp = employees[i];
                                employees[i] = employees[j];
                                employees[j] = temp;
                            }
                        }
                    }
                    System.out.println("Danh sách nhân viên sau khi sắp xếp:");
                    for (int i = 0; i < empCount; i++) {
                        employees[i].displayData();
                    }
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 7);
    }


    private static void projectMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("==================== QUẢN LÝ DỰ ÁN ====================");
            System.out.println("1. Thêm dự án");
            System.out.println("2. Hiển thị danh sách dự án");
            System.out.println("3. Cập nhật thông tin dự án");
            System.out.println("4. Xóa dự án (chỉ khi chưa có nhân viên tham gia)");
            System.out.println("5. Thêm nhân viên vào dự án");
            System.out.println("6. Tìm dự án theo tên");
            System.out.println("7. Thống kê số lượng nhân viên theo vai trò");
            System.out.println("8. Tìm dự án đang chạy và gần kết thúc nhất");
            System.out.println("9. Thoát");
            System.out.println("=======================================================");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    Project proj = new Project();
                    proj.inputData(scanner, new Employee[0]);
                    projects[projCount++] = proj;
                    break;
                case 2:
                    for (int i = 0; i < projCount; i++) {
                        projects[i].displayData();
                    }
                    break;
                case 3:
                    System.out.print("Nhập ID dự án cần cập nhật: ");
                    String updateId = scanner.nextLine();
                    for (int i = 0; i < projCount; i++) {
                        if (projects[i].getProjectId().equals(updateId)) {
                            projects[i].inputData(scanner, projects[i].getEmployees());
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Nhập ID dự án cần xóa: ");
                    String deleteId = scanner.nextLine();
                    for (int i = 0; i < projCount; i++) {
                        if (projects[i].getProjectId().equals(deleteId) &&
                                (projects[i].getEmployees() == null || projects[i].getEmployees().length == 0)) {
                            for (int j = i; j < projCount - 1; j++) {
                                projects[j] = projects[j + 1];
                            }
                            projCount--;
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.print("Nhập ID dự án: ");
                    String projId = scanner.nextLine();
                    for (int i = 0; i < projCount; i++) {
                        if (projects[i].getProjectId().equals(projId)) {
                            System.out.print("Nhập ID nhân viên muốn thêm: ");
                            String empId = scanner.nextLine();
                            for (int j = 0; j < empCount; j++) {
                                if (employees[j].getEmployeeId().equals(empId)) {
                                    Employee[] newList = new Employee[]{employees[j]};
                                    projects[i].setEmployees(newList);
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.print("Nhập tên dự án cần tìm: ");
                    String name = scanner.nextLine();
                    for (int i = 0; i < projCount; i++) {
                        if (projects[i].getProjectName().contains(name)) {
                            projects[i].displayData();
                        }
                    }
                    break;
                case 7:
                    for (int i = 0; i < projCount; i++) {
                        System.out.println("Thống kê dự án: " + projects[i].getProjectName());
                        int dev = 0, tester = 0, pm = 0, ba = 0;
                        if (projects[i].getEmployees() != null) {
                            for (Employee emp : projects[i].getEmployees()) {
                                switch (emp.getRole()) {
                                    case DEV -> dev++;
                                    case TESTER -> tester++;
                                    case PM -> pm++;
                                    case BA -> ba++;
                                }
                            }
                        }
                        System.out.printf("DEV: %d | TESTER: %d | PM: %d | BA: %d\n", dev, tester, pm, ba);
                    }
                    break;
                case 8:
                    Project nearest = null;
                    for (int i = 0; i < projCount; i++) {
                        if (projects[i].getStatus() == Project.Status.RUNNING) {
                            if (nearest == null || projects[i].getEndDate().isBefore(nearest.getEndDate())) {
                                nearest = projects[i];
                            }
                        }
                    }
                    if (nearest != null) {
                        System.out.println("Dự án gần kết thúc nhất:");
                        nearest.displayData();
                    }
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 9);
    }


}
