package session14;

import java.util.ArrayList;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> validNumbers = new ArrayList<>();
        int invalidCount = 0;

        System.out.println("Nhập danh sách chuỗi (gõ 'exit' để kết thúc):");

        while (true) {
            System.out.print("Nhập chuỗi: ");
            String input = scanner.nextLine();

            // Ký hiệu kết thúc
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                // Chuyển đổi chuỗi sang số nguyên
                int number = Integer.parseInt(input);
                validNumbers.add(number);
            } catch (NumberFormatException e) {
                // Chuỗi không hợp lệ
                System.out.println("Lỗi: '" + input + "' không phải là số nguyên hợp lệ.");
                invalidCount++;
            }
        }

        // Hiển thị kết quả
        System.out.println("\n--- Kết quả ---");
        System.out.println("Số lượng chuỗi hợp lệ: " + validNumbers.size());
        System.out.println("Số lượng chuỗi không hợp lệ: " + invalidCount);
        System.out.println("Danh sách số nguyên hợp lệ: " + validNumbers);

        scanner.close();
    }
}

