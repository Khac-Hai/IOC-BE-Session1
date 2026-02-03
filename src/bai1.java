import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap r:");
        double r = sc.nextDouble();
        double S = Math.PI*(r*r);
        System.out.printf("dien tich hinh tron la:"+S);
    }
}
