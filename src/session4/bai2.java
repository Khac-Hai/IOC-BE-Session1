package session4;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng của mảng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int cols = scanner.nextInt();
        int[][] array = new int[rows][cols];
        int evenSum = 0;
        int oddSum = 0;
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
                if (array[i][j] % 2 == 0) {
                    evenSum += array[i][j];
                } else {
                    oddSum += array[i][j];
                }
            }
        }
        System.out.println("Tổng các số chẵn: " + evenSum);
        System.out.println("Tổng các số lẻ: " + oddSum);
    }
}
