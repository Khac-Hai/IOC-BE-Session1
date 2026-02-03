package session02;

import java.util.Scanner;

public class bai1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Nhap 1 so nguyen:");
            n = sc.nextInt();
            if(n<0){
                System.out.println("Lỗi vui long nhap lai");
            }
            else{
                System.out.println("So hop le:"+n);
                break;
            }


        }

    }
}
