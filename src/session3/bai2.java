package session3;

import java.util.ArrayList;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> diemList = new ArrayList<>();
        int choice;
        while (true) {
            System.out.println("\n====== MENU ======");
            System.out.println("1. Nhập điểm học viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\n--- Nhập điểm học viên (nhập -1 để dừng) ---");
                    while (true) {
                        System.out.print("Nhập điểm: ");
                        double diem = sc.nextDouble();
                        if (diem == -1) break;
                        if (diem < 0 || diem > 10) {
                            System.out.println("Điểm không hợp lệ. Nhập lại.");
                            continue;
                        }
                        diemList.add(diem);
                        System.out.println("Học lực: " + xepLoai(diem));
                    }
                    break;
                case 2:
                    if (diemList.isEmpty()) {
                        System.out.println("Chưa có dữ liệu.");
                    } else {
                        double tong = 0, max = diemList.get(0), min = diemList.get(0);
                        for (double d : diemList) {
                            tong += d;
                            if (d > max) max = d;
                            if (d < min) min = d;
                        }
                        double tb = tong / diemList.size();
                        System.out.println("\n--- KẾT QUẢ ---");
                        System.out.println("Số học viên đã nhập: " + diemList.size());
                        System.out.printf("Điểm trung bình: %.2f\n", tb);
                        System.out.printf("Điểm cao nhất: %.2f\n", max);
                        System.out.printf("Điểm thấp nhất: %.2f\n", min);
                    }
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
    public static String xepLoai(double diem) {
        if (diem < 5) return "Yếu";
        else if (diem < 7) return "Trung bình";
        else if (diem < 8) return "Khá";
        else if (diem < 9) return "Tốt";
        else return "Xuất sắc";
    }
}
