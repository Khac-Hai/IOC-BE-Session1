import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tử 1:");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so mẫu 1:");
        int b = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so tử 2:");
        int c = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so mẫu 2:");
        int d = Integer.parseInt(sc.nextLine());
        int tu_so = (a*d)+(b*c);
        int mau_so = b*d;
        System.out.println("Tong 2 phan so:"+tu_so+"/"+mau_so);
    }
}
