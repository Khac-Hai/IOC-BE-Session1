package session2;

import java.util.Scanner;

public class bai1 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap n:");
        n = sc.nextInt();
        if(n <= 0){
            System.out.println("Số không hợp lệ");
        }else {
            int tong = 0;
            for (int i = 1; i <= n; i++) {
                tong += i;
            }
            System.out.println("Tổng các số từ 1 đến "+n+" là: " + tong);
        }

    }
}
