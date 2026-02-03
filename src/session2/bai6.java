package session2;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        while (true) {
            System.out.print("Nhập số nguyên dương N: ");
            if (sc.hasNextInt()) {
                N = sc.nextInt();
                if (N > 0) break;
            } else {
                sc.next();
            }
            System.out.println("Số đầu vào không hợp lệ. Vui lòng nhập lại.");
        }
        System.out.println("Các số Armstrong từ 0 đến " + N + ":");
        for (int i = 0; i <= N; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static boolean isArmstrong(int num) {
        int original = num;
        int digits = String.valueOf(num).length();
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == original;
    }
}
