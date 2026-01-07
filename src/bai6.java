import java.util.Scanner;
public class bai6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vận tốc = ");
        float speed = sc.nextFloat();
        System.out.print("Nhập thời gian đi = ");
        float time = sc.nextFloat();
        float distance = speed*time;
        System.out.printf("Quãng đường đi được: %.2f km\n", distance);
    }
}
