package session4;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
        }
        System.out.println("Mảng sau khi sắp xếp giảm dần:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("Nhập số cần tìm: ");
        int target = scanner.nextInt();

        // Tìm kiếm tuyến tính
        int linearIndex = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                linearIndex = i;
                break;
            }
        }
        if (linearIndex != -1) {
            System.out.println("Tìm kiếm tuyến tính: Số " + target + " có tại vị trí " + linearIndex);
        } else {
            System.out.println("Tìm kiếm tuyến tính: Không tìm thấy số " + target);
        }
        int binaryIndex = binarySearchDescending(arr, target);
        if (binaryIndex != -1) {
            System.out.println("Tìm kiếm nhị phân: Số " + target + " có tại vị trí " + binaryIndex);
        } else {
            System.out.println("Tìm kiếm nhị phân: Không tìm thấy số " + target);
        }
    }
    public static int binarySearchDescending(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
