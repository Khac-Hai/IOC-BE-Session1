package session14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập một số nguyên: ");
            int number = scanner.nextInt();

            // Kiểm tra số nhập vào có hợp lệ không
            if (number <= 0) {
                System.out.println("Lỗi: Số nhập vào không hợp lệ để kiểm tra số nguyên tố (phải > 0).");
            } else {
                // Kiểm tra số nguyên tố
                if (isPrime(number)) {
                    System.out.println(number + " là số nguyên tố.");
                } else {
                    System.out.println(number + " không phải là số nguyên tố.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Dữ liệu nhập vào không phải là số nguyên.");
        } finally {
            scanner.close();
        }
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
