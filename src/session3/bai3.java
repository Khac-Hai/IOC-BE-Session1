package session3;

import java.util.ArrayList;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> luongList = new ArrayList<>();
        int choice;
        while (true) {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Nhập lương nhân viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Tính tổng tiền thưởng nhân viên");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("--- Nhập lương nhân viên (nhập -1 để kết thúc) ---");
                    while (true) {
                        System.out.print("Nhập lương: ");
                        double luong = sc.nextDouble();
                        if (luong == -1) break;
                        if (luong < 0 || luong > 500_000_000) {
                            System.out.println("Lương không hợp lệ. Nhập lại.");
                            continue;
                        }
                        luongList.add(luong);
                        System.out.println("-> Phân loại: " + phanLoai(luong));
                    }
                    break;
                case 2:
                    if (luongList.isEmpty()) {
                        System.out.println("Không có dữ liệu.");
                    } else {
                        double tong = 0, max = luongList.get(0), min = luongList.get(0);
                        for (double l : luongList) {
                            tong += l;
                            if (l > max) max = l;
                            if (l < min) min = l;
                        }
                        double tb = tong / luongList.size();
                        System.out.println("\n--- Thống kê ---");
                        System.out.println("Số nhân viên: " + luongList.size());
                        System.out.printf("Tổng lương: %,d VND\n", (long) tong);
                        System.out.printf("Lương trung bình: %,d VND\n", (long) tb);
                        System.out.printf("Lương cao nhất: %,d VND\n", (long) max);
                        System.out.printf("Lương thấp nhất: %,d VND\n", (long) min);
                    }
                    break;
                case 3:
                    if (luongList.isEmpty()) {
                        System.out.println("Không có dữ liệu.");
                    } else {
                        double tongThuong = 0;
                        for (double l : luongList) {
                            tongThuong += tinhThuong(l);
                        }
                        System.out.println("\n--- Tính tổng số tiền thưởng nhân viên ---");
                        System.out.printf("Tổng tiền thưởng nhân viên: %,d VND\n", (long) tongThuong);
                    }
                    break;

                case 4:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
    public static String phanLoai(double luong) {
        if (luong < 5_000_000) return "Thu nhập thấp";
        else if (luong < 15_000_000) return "Trung bình";
        else if (luong < 50_000_000) return "Khác";
        else return "Cao";
    }
    public static double tinhThuong(double luong) {
        if (luong < 5_000_000) return luong * 0.05;
        else if (luong < 15_000_000) return luong * 0.10;
        else if (luong < 50_000_000) return luong * 0.15;
        else if (luong < 100_000_000) return luong * 0.20;
        else return luong * 0.25;
    }
}
