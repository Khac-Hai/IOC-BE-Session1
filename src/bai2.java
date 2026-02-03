import java.util.Scanner;
public class bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so thu nhat(firstNumber):");
        int firstNumber = Integer.parseInt(sc.nextLine());
        System.out.printf("Nhap so thu hai(secondNumber):");
        int secondNumber = Integer.parseInt(sc.nextLine());
        int sum = firstNumber + secondNumber;
        int rest = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        System.out.printf("Tong" +sum);
        System.out.printf("Tong" +rest);
        System.out.printf("Tong" +multiplication);
        System.out.printf("Tong" +division);
    }
}
