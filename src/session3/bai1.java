package session3;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tên khách hàng: ");
        String tenKhachHang = sc.nextLine();
        System.out.print("Tên sản phẩm: ");
        String tenSanPham = sc.nextLine();
        System.out.print("Giá sản phẩm: ");
        double gia = sc.nextDouble();
        System.out.print("Số lượng: ");
        int soLuong = sc.nextInt();
        System.out.print("Thẻ thành viên: ");
        boolean laThanhVien = sc.nextBoolean();
        double thanhTien = gia * soLuong;
        double giamGia = laThanhVien ? thanhTien * 0.10 : 0;
        double tienVAT = (thanhTien - giamGia) * 0.08;
        double tongThanhToan = thanhTien - giamGia + tienVAT;
        System.out.println("\n--- HÓA ĐƠN ---");
        System.out.println("Khách hàng: " + tenKhachHang);
        System.out.println("Sản phẩm: " + tenSanPham);
        System.out.printf("Giá: %.0f VND\n", gia);
        System.out.println("Số lượng: " + soLuong);
        System.out.printf("Thành tiền: %.0f VND\n", thanhTien);
        System.out.printf("Giảm giá: %.0f VND\n", giamGia);
        System.out.printf("Tiền VAT: %.0f VND\n", tienVAT);
        System.out.printf("Tổng tiền thanh toán: %.0f VND\n", tongThanhToan);
    }
}
