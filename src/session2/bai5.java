package session2;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số có 3 chữ số: ");
        int number = sc.nextInt();
        if (number < 100 || number > 999) {
            System.out.println("Số nhập không hợp lệ");
            return;
        }
        int tram = number / 100;
        int chuc = (number / 10) % 10;
        int don_vi = number % 10;
        String[] digit = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        System.out.print(digit[tram] + " trăm ");
        if (chuc == 0 && don_vi != 0) {
            System.out.print("lẻ " + digit[don_vi]);
        } else if (chuc == 1) {
            System.out.print("mười ");
            if (don_vi == 5) {
                System.out.print("lăm");
            } else if (don_vi != 0) {
                System.out.print(digit[don_vi]);
            }
        } else {
            if (chuc != 0) {
                System.out.print(digit[chuc] + " mươi ");
            }
            if (don_vi == 1 && chuc != 0) {
                System.out.print("mốt");
            } else if (don_vi == 5 && chuc != 0) {
                System.out.print("lăm");
            } else if (don_vi != 0) {
                System.out.print(digit[don_vi]);
            }
        }
        System.out.println();
    }
}
