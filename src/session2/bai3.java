package session2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập số nguyên N:");
        int n=sc.nextInt();
        int soduong = Math.abs(n);
        int tong = 0;
        while(soduong>0){
            tong += soduong % 10;
            soduong /= 10;
        }
        System.out.println("Tổng các chữ số là:"+tong);



    }
}
