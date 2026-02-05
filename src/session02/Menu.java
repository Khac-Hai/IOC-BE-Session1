package session02;
import java.util.Scanner;
public class Menu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Menu-----");
        System.out.println("1. Tinh Tong:");
        System.out.println("2. Tinh Thuong");
        System.out.println("Nhap nua chon cua ban:");
        switch (sc.nextInt()) {
            case 1:
                System.out.print("Nhap so tu nhien n:");
                int n = sc.nextInt();
                int tong = n*(n+1)/2;
                System.out.println("Tong:"+tong);
                break;
            case 2:
                System.out.print("Nhap so tu nhien a:");
                int a = sc.nextInt();
                System.out.print("Nhap so tu nhien b:");
                int b = sc.nextInt();

                if(b==0){
                    System.out.println("Loi");
                }
                else{
                    int thuong = a/b;
                    System.out.println("Thuong:"+thuong);
                }
        }


    }
}
