package session2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thang:");
        int n = sc.nextInt();
        if (n >= 1 && n < 13) {
            switch(n) {
                case 1:
                    n = 1;
                    System.out.println("Tháng 1 có 31 ngày");
                    break;
                case 2:
                    n = 2;
                    System.out.println("Tháng 2 có 28 hoặc 29 ngày");
                    break;
                case 3:
                    n = 3;
                    System.out.println("Tháng 3 có 31 ngày");
                    break;
                case 4:
                    n = 4;
                    System.out.println("Tháng 4 có 30 ngày");
                    break;
                case 5:
                    n = 5;
                    System.out.println("Tháng 5có 31 ngày");
                    break;
                case 6:
                    n = 6;
                    System.out.println("Tháng 6 có 30 ngày");
                    break;
                case 7:
                    n = 7;
                    System.out.println("Tháng 7 có 31 ngày");
                    break;
                case 8:
                    n = 8;
                    System.out.println("Tháng 8 có 31 ngày");
                    break;
                case 9:
                    n = 9;
                    System.out.println("Tháng 9 có 30 ngày");
                    break;
                case 10:
                    n = 10;
                    System.out.println("Tháng 10 có 31 ngày");
                    break;
                case 11:
                    n = 11;
                    System.out.println("Tháng 11 có 30 ngày");
                    break;
                case 12:
                    n = 12;
                    System.out.println("Tháng 12 có 31 ngày");
                    break;
            }
        } else{
            System.out.println("Tháng không hợp lệ");
        }
    }
}
