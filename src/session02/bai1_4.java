package session02;

import java.util.Scanner;

public class bai1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-----Menu-----");
            System.out.println("1. tinh giai thua cua n:");
            System.out.println("2. tinh tong cua n so dau tien");
            System.out.println("3.tim cac uoc cua 1 so n");
            System.out.println("4.thoat");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Tinh giai thua cua n:");
                    break;
                case 2:
                    System.out.println("tong cua n so dau tien");
                    break;
                case 3:
                    System.out.println("tim cac uoc cua 1 so n");
                    break;
                case 4:
                    System.out.println("thoat");
                    break;
                default:
                    System.out.println("khong hop le");
            }
        }
        while (choice!=4);
        sc.close();

    }
}
