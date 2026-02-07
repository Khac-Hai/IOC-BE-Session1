package session14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Custom Exception
class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}

public class bai4 {
    // Hàm kiểm tra số điện thoại
    public static void validatePhoneNumber(String phone) throws InvalidPhoneNumberException {
        // Kiểm tra độ dài
        if (phone.length() != 10) {
            throw new InvalidPhoneNumberException("Sai độ dài (phải gồm đúng 10 chữ số).");
        }
        // Kiểm tra ký tự chỉ là số
        if (!phone.matches("\\d{10}")) {
            throw new InvalidPhoneNumberException("Chứa ký tự không hợp lệ (chỉ cho phép 0-9).");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> validPhones = new ArrayList<>();
        List<String> invalidPhones = new ArrayList<>();
        List<String> reasons = new ArrayList<>();

        System.out.println("Nhập danh sách số điện thoại, cách nhau bằng dấu phẩy (,):");
        String input = scanner.nextLine();

        // Tách chuỗi thành từng số điện thoại
        String[] phones = input.split(",");

        for (String phone : phones) {
            phone = phone.trim(); // loại bỏ khoảng trắng thừa
            try {
                validatePhoneNumber(phone);
                validPhones.add(phone);
            } catch (InvalidPhoneNumberException e) {
                invalidPhones.add(phone);
                reasons.add(e.getMessage());
            }
        }

        // Hiển thị kết quả
        System.out.println("\n--- Kết quả ---");
        System.out.println("Danh sách số điện thoại hợp lệ: " + validPhones);

        System.out.println("Danh sách số điện thoại không hợp lệ:");
        for (int i = 0; i < invalidPhones.size(); i++) {
            System.out.println("- " + invalidPhones.get(i) + " → " + reasons.get(i));
        }

        scanner.close();
    }
}
