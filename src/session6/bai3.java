package session6;

import java.util.*;

public class bai3 {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> biensoxe = new ArrayList<>();

    public static void main(String[] args) {
        int chon;
        do {
            System.out.println("\n********** quản lý biển số xe **********");
            System.out.println("1. thêm các biển số xe");
            System.out.println("2. hiển thị danh sách biển số xe");
            System.out.println("3. tìm kiếm biển số xe");
            System.out.println("4. tìm biển số xe theo mã tỉnh");
            System.out.println("5. sắp xếp biển số xe tăng dần");
            System.out.println("6. thoát");
            System.out.print("lựa chọn của bạn: ");
            chon = scanner.nextInt();
            scanner.nextLine();

            switch (chon) {
                case 1 -> thembiensoxe();
                case 2 -> hienthibiensoxe();
                case 3 -> timkiembiensoxe();
                case 4 -> timtheomatinh();
                case 5 -> sapxepbiensoxe();
                case 6 -> System.out.println("đã thoát chương trình.");
                default -> System.out.println("lựa chọn không hợp lệ.");
            }
        } while (chon != 6);
    }

    static void thembiensoxe() {
        System.out.print("nhập số lượng biển số xe: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("biển số xe " + (i + 1) + ": ");
            String bien = scanner.nextLine().trim().toUpperCase();
            if (kiemdinhdang(bien)) {
                biensoxe.add(bien);
            } else {
                System.out.println("định dạng không hợp lệ. ví dụ đúng: 30F-123.45");
                i--;
            }
        }
    }

    static boolean kiemdinhdang(String bien) {
        return bien.matches("^\\d{2}[A-Z]-\\d{3}\\.\\d{2}$");
    }

    static void hienthibiensoxe() {
        System.out.println("danh sách biển số xe:");
        for (String bien : biensoxe) {
            System.out.println(bien);
        }
    }

    static void timkiembiensoxe() {
        System.out.print("nhập biển số xe cần tìm: ");
        String biencan = scanner.nextLine().trim().toUpperCase();
        if (biensoxe.contains(biencan)) {
            System.out.println("tìm thấy: " + biencan);
        } else {
            System.out.println("không tìm thấy biển số xe.");
        }
    }

    static void timtheomatinh() {
        System.out.print("nhập mã tỉnh cần tìm (vd: 30): ");
        String matinh = scanner.nextLine().trim();
        boolean timthay = false;
        for (String bien : biensoxe) {
            if (bien.startsWith(matinh)) {
                System.out.println(bien);
                timthay = true;
            }
        }
        if (!timthay) {
            System.out.println("không có biển số nào thuộc mã tỉnh này.");
        }
    }

    static void sapxepbiensoxe() {
        Collections.sort(biensoxe);
        System.out.println("đã sắp xếp biển số xe tăng dần.");
        hienthibiensoxe();
    }
}
