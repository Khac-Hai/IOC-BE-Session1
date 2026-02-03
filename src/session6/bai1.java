package session6;

import java.util.*;

public class bai1 {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Double> diemSV = new ArrayList<>();

    public static void main(String[] args) {
        int chon;
        do {
            System.out.println("\n********** QUẢN LÝ ĐIỂM SV **********");
            System.out.println("1. Nhập danh sách điểm sinh viên");
            System.out.println("2. In danh sách điểm");
            System.out.println("3. Tính điểm trung bình");
            System.out.println("4. Tìm điểm cao nhất và thấp nhất");
            System.out.println("5. Đếm số lượng sinh viên đạt và trượt");
            System.out.println("6. Sắp xếp điểm tăng dần");
            System.out.println("7. Thống kê sinh viên giỏi và xuất sắc");
            System.out.println("8. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            chon = scanner.nextInt();

            switch (chon) {
                case 1 -> nhapdiem();
                case 2 -> indiem();
                case 3 -> tinhtrungbinh();
                case 4 -> timminmax();
                case 5 -> demdattruot();
                case 6 -> sapxep();
                case 7 -> thongkegioixuatsac();
                case 8 -> System.out.println("Đã thoát chương trình.");
                default -> System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (chon != 8);
    }

    static void nhapdiem() {
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        diemSV.clear();
        for (int i = 0; i < n; i++) {
            System.out.print("Điểm sinh viên " + (i + 1) + ": ");
            double diem = scanner.nextDouble();
            diemSV.add(diem);
        }
    }

    static void indiem() {
        System.out.println("Danh sách điểm:");
        for (int i = 0; i < diemSV.size(); i++) {
            System.out.println("SV " + (i + 1) + ": " + diemSV.get(i));
        }
    }

    static void tinhtrungbinh() {
        double tong = 0;
        for (double diem : diemSV) tong += diem;
        double tb = diemSV.isEmpty() ? 0 : tong / diemSV.size();
        System.out.println("Điểm trung bình: " + tb);
    }

    static void timminmax() {
        if (diemSV.isEmpty()) {
            System.out.println("Chưa có dữ liệu.");
            return;
        }
        double min = Collections.min(diemSV);
        double max = Collections.max(diemSV);
        System.out.println("Điểm thấp nhất: " + min);
        System.out.println("Điểm cao nhất: " + max);
    }

    static void demdattruot() {
        int dat = 0, truot = 0;
        for (double diem : diemSV) {
            if (diem >= 5) dat++;
            else truot++;
        }
        System.out.println("Số SV đạt: " + dat);
        System.out.println("Số SV trượt: " + truot);
    }

    static void sapxep() {
        Collections.sort(diemSV);
        System.out.println("Đã sắp xếp điểm tăng dần.");
        indiem();
    }

    static void thongkegioixuatsac() {
        int gioi = 0;
        for (double diem : diemSV) {
            if (diem >= 8) gioi++;
        }
        System.out.println("Số SV giỏi và xuất sắc (>=8): " + gioi);
    }
}
