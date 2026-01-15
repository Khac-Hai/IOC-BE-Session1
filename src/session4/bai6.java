package session4;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng nhân viên: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Không có nhân viên nào.");
            return;
        }
        double[] salaries = new double[n];
        boolean isSortedAscending = false;
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập lương nhân viên thứ " + (i + 1) + ": ");
            salaries[i] = scanner.nextDouble();
        }
        while (true) {
            System.out.println("\n---- QUẢN LÝ LƯƠNG NHÂN VIÊN ----");
            System.out.println("1. Xem danh sách lương");
            System.out.println("2. Sắp xếp lương");
            System.out.println("3. Tìm kiếm lương cụ thể");
            System.out.println("4. Thống kê lương");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Danh sách lương:");
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhân viên " + (i + 1) + ": " + salaries[i]);
                    }
                    break;

                case 2:
                    System.out.println("Sắp xếp theo : ");
                    System.out.println("1. Tăng dần");
                    System.out.println("2. Giảm dần");
                    int sortType = scanner.nextInt();
                    bubbleSort(salaries, sortType == 1);
                    isSortedAscending = (sortType == 1);
                    System.out.println("Danh sách sau khi sắp xếp:");
                    for (double salary : salaries) {
                        System.out.print(salary + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Nhập lương cần tìm: ");
                    double target = scanner.nextDouble();
                    System.out.println("Tìm kiếm tuyến tính:");
                    linearSearch(salaries, target);
                    if (isSortedAscending) {
                        System.out.println("Tìm kiếm nhị phân:");
                        binarySearch(salaries, target);
                    } else {
                        System.out.println("Mảng chưa được sắp xếp tăng dần. Không thể tìm kiếm nhị phân.");
                    }
                    break;

                case 4:
                    double sum = 0, max = salaries[0], min = salaries[0];
                    int aboveAverageCount = 0;
                    for (double salary : salaries) {
                        sum += salary;
                        if (salary > max) max = salary;
                        if (salary < min) min = salary;
                    }
                    double avg = sum / n;
                    for (double salary : salaries) {
                        if (salary > avg) aboveAverageCount++;
                    }
                    System.out.println("Tổng lương: " + sum);
                    System.out.println("Lương trung bình: " + avg);
                    System.out.println("Lương cao nhất: " + max);
                    System.out.println("Lương thấp nhất: " + min);
                    System.out.println("Số nhân viên có lương trên trung bình: " + aboveAverageCount);
                    break;

                case 5:
                    System.out.println("Đã thoát chương trình.");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
    public static void bubbleSort(double[] arr, boolean ascending) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if ((ascending && arr[j] > arr[j + 1]) || (!ascending && arr[j] < arr[j + 1])) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void linearSearch(double[] arr, double target) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Tìm thấy tại vị trí " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy lương " + target);
        }
    }
    public static void binarySearch(double[] arr, double target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                System.out.println("Tìm thấy tại vị trí " + mid);
                return;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Không tìm thấy lương " + target);
    }
}
