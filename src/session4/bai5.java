package session4;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Không có sinh viên nào.");
            return;
        }
        double[] scores = new double[n];
        boolean isSorted = false;
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập điểm sinh viên thứ " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
        }
        while (true) {
            System.out.println("\n--- QUẢN LÝ ĐIỂM SINH VIÊN ---");
            System.out.println("1. Xem tất cả điểm");
            System.out.println("2. Sắp xếp điểm");
            System.out.println("3. Tìm kiếm điểm");
            System.out.println("4. Thống kê điểm");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Danh sách điểm:");
                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh viên " + (i + 1) + ": " + scores[i]);
                    }
                    break;

                case 2:
                    System.out.println("Chọn cách sắp xếp: ");
                    System.out.println("1. Tăng dần");
                    System.out.println("2. Giảm dần");
                    int sortType = scanner.nextInt();
                    bubbleSort(scores, sortType == 1);
                    isSorted = true;
                    System.out.println("Danh sách sau khi sắp xếp:");
                    for (double score : scores) {
                        System.out.print(score + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Nhập điểm cần tìm: ");
                    double target = scanner.nextDouble();
                    System.out.println("Tìm kiếm tuyến tính:");
                    linearSearch(scores, target);
                    if (isSorted) {
                        System.out.println("Tìm kiếm nhị phân:");
                        binarySearch(scores, target);
                    } else {
                        System.out.println("Mảng chưa được sắp xếp. Không thể tìm kiếm nhị phân.");
                    }
                    break;

                case 4:
                    double sum = 0, max = scores[0], min = scores[0];
                    int aboveAverageCount = 0;
                    for (double score : scores) {
                        sum += score;
                        if (score > max) max = score;
                        if (score < min) min = score;
                    }
                    double avg = sum / n;
                    for (double score : scores) {
                        if (score > avg) aboveAverageCount++;
                    }
                    System.out.println("Điểm trung bình: " + avg);
                    System.out.println("Điểm cao nhất: " + max);
                    System.out.println("Điểm thấp nhất: " + min);
                    System.out.println("Số sinh viên trên trung bình: " + aboveAverageCount);
                    break;

                case 5:
                    System.out.println("Thoát chương trình.");
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
            System.out.println("Không tìm thấy điểm " + target);
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
        System.out.println("Không tìm thấy điểm " + target);
    }
}
