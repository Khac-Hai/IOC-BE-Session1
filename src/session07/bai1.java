package session07;

import java.util.Scanner;

public class bai1 {
    String masanpham;
    String tensanpham;
    String mota;
    double giatien;
    int tonkho;
    boolean trangthai;

    public bai1() {
    }

    public bai1(String masanpham, String tensanpham, String mota, double giatien, int tonkho, boolean trangthai) {
        this.masanpham = masanpham;
        this.tensanpham = tensanpham;
        this.mota = mota;
        this.giatien = giatien;
        this.tonkho = tonkho;
        this.trangthai = trangthai;
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm: ");
        masanpham = sc.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        tensanpham = sc.nextLine();
        System.out.print("Nhập mô tả: ");
        mota = sc.nextLine();
        System.out.print("Nhập giá tiền: ");
        giatien = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập số lượng tồn kho: ");
        tonkho = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập trạng thái (true = hiện, false = ẩn): ");
        trangthai = Boolean.parseBoolean(sc.nextLine());
    }

    public void displayInfo() {
        System.out.println("Mã sản phẩm: " + masanpham);
        System.out.println("Tên sản phẩm: " + tensanpham);
        System.out.println("Mô tả: " + mota);
        System.out.println("Giá tiền: " + giatien);
        System.out.println("Tồn kho: " + tonkho);
        System.out.println("Trạng thái: " + (trangthai ? "Hiển thị" : "Ẩn"));
    }
}
