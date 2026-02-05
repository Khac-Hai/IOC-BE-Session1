package session05;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập email: ");
        String email = sc.nextLine().trim();

        // Biểu thức chính quy kiểm tra định dạng email
        String regex = "^[A-Za-z0-9._]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*\\.[A-Za-z]{2,6}$";

        if (email.matches(regex)) {
            System.out.println("Email hợp lệ");
        } else {
            System.out.println("Email không hợp lệ");
        }

        sc.close();
    }
}
