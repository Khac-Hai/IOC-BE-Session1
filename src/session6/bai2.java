package session6;

import java.util.Scanner;
import java.util.regex.*;

public class bai2 {
    static Scanner scanner = new Scanner(System.in);
    static String hoten = "", email = "", sdt = "", matkhau = "";

    public static void main(String[] args) {
        int chon;
        do {
            System.out.println("\n********** quản lý người dùng **********");
            System.out.println("1. nhập thông tin người dùng");
            System.out.println("2. chuẩn hóa họ tên");
            System.out.println("3. kiểm tra email hợp lệ");
            System.out.println("4. kiểm tra số điện thoại hợp lệ");
            System.out.println("5. kiểm tra mật khẩu hợp lệ");
            System.out.println("6. thoát");
            System.out.print("lựa chọn của bạn: ");
            chon = scanner.nextInt();
            scanner.nextLine();

            switch (chon) {
                case 1 -> nhapthongtin();
                case 2 -> chuanhoahoten();
                case 3 -> kiemtraemail();
                case 4 -> kiemtrasdt();
                case 5 -> kiemtramatkhau();
                case 6 -> System.out.println("đã thoát chương trình.");
                default -> System.out.println("lựa chọn không hợp lệ.");
            }
        } while (chon != 6);
    }

    static void nhapthongtin() {
        System.out.print("họ và tên: ");
        hoten = scanner.nextLine();
        System.out.print("email: ");
        email = scanner.nextLine();
        System.out.print("số điện thoại: ");
        sdt = scanner.nextLine();
        System.out.print("mật khẩu: ");
        matkhau = scanner.nextLine();
    }

    static void chuanhoahoten() {
        hoten = hoten.trim().toLowerCase();
        String[] tu = hoten.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String t : tu) {
            sb.append(Character.toUpperCase(t.charAt(0)))
                    .append(t.substring(1)).append(" ");
        }
        hoten = sb.toString().trim();
        System.out.println("họ tên sau chuẩn hóa: " + hoten);
    }

    static void kiemtraemail() {
        String mau = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        boolean hople = Pattern.matches(mau, email);
        System.out.println("email " + (hople ? "hợp lệ" : "không hợp lệ"));
    }

    static void kiemtrasdt() {
        String mau = "^(03|05|07|08|09)\\d{8}$";
        boolean hople = Pattern.matches(mau, sdt);
        System.out.println("số điện thoại " + (hople ? "hợp lệ" : "không hợp lệ"));
    }

    static void kiemtramatkhau() {
        String mau = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
        boolean hople = Pattern.matches(mau, matkhau);
        System.out.println("mật khẩu " + (hople ? "hợp lệ" : "không hợp lệ"));
    }
}
