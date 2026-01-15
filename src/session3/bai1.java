package session3;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Tên Khach Hàng:");
        String name = sc.nextLine();
        System.out.print("Sản Phẩm:");
        String product = sc.nextLine();
        System.out.print("Giá");
        int price = sc.nextInt();
        System.out.print("Số lượng");
        int quantity = sc.nextInt();
        System.out.print("Thẻ thành viên");
        boolean membership = sc.nextBoolean();
        double thanhtien = price*quantity;
        double giamgia = membership ? thanhtien * 0.10 : 0;
        double tienVAT = (thanhtien - giamgia) * 0.08;
        double tongtien = thanhtien - giamgia + tienVAT;
        System.out.println("Khách hàng:" + name);
        System.out.println("Sản phẩm:"+product);
        System.out.println("Giá:"+price);
        System.out.println("Số lượng:"+quantity);
        System.out.println("Thành tiền:"+thanhtien);
        System.out.println("Giảm giá:"+giamgia);
        System.out.println("Tiền VAT:"+tienVAT);
        System.out.println("Tổng tiền thanh toán:"+tongtien);
    }
}
