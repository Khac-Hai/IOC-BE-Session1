import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cân nặng =");
        float can_nang = sc.nextFloat();
        System.out.print("Chiều cao =");
        float chieu_cao = sc.nextFloat();
        float BMI = can_nang / (chieu_cao * chieu_cao);
        System.out.println("Chỉ số BMI = " + BMI);
    }
}
