package session05;

import java.util.Scanner;

public class bai5 {
    private static String input = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("******** MENU ********");
            System.out.println("1. Nhập chuỗi");
            System.out.println("2. Đếm ký tự");
            System.out.println("3. Đảo ngược chuỗi");
            System.out.println("4. Kiểm tra Palindrome");
            System.out.println("5. Chuẩn hóa chuỗi");
            System.out.println("6. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.print("Nhập chuỗi: ");
                    input = sc.nextLine();
                }
                case 2 -> countChars(input);
                case 3 -> System.out.println("Đảo ngược: " + new StringBuilder(input).reverse());
                case 4 -> {
                    String cleaned = input.replaceAll("\\s+", "").toLowerCase();
                    boolean isPal = cleaned.equals(new StringBuilder(cleaned).reverse().toString());
                    System.out.println(isPal ? "Palindrome" : "Không phải Palindrome");
                }
                case 5 -> System.out.println("Chuẩn hóa: " + normalize(input));
                case 6 -> System.out.println("Thoát chương trình.");
                default -> System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 6);
        sc.close();
    }

    private static void countChars(String s) {
        int lower = 0, upper = 0, digit = 0, special = 0;
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) lower++;
            else if (Character.isUpperCase(c)) upper++;
            else if (Character.isDigit(c)) digit++;
            else special++;
        }
        System.out.println("Thường: " + lower + ", Hoa: " + upper + ", Số: " + digit + ", Đặc biệt: " + special);
    }

    private static String normalize(String s) {
        String[] parts = s.trim().replaceAll("\\s+", " ").split(" ");
        StringBuilder sb = new StringBuilder();
        for (String w : parts) {
            sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }
}
