package session4;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Mảng không có phần tử");
            return;
        }
        int[] arr = new int[n];
        int[] even = new int[n];
        int[] odd = new int[n];
        int evenCount = 0, oddCount = 0;
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();

            if (arr[i] % 2 == 0) {
                even[evenCount++] = arr[i];
            } else {
                odd[oddCount++] = arr[i];
            }
        }
        int[] result = new int[n];
        int index = 0;
        for (int i = 0; i < evenCount; i++) {
            result[index++] = even[i];
        }
        for (int i = 0; i < oddCount; i++) {
            result[index++] = odd[i];
        }
        System.out.println("Mảng sau khi sắp xếp:");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
