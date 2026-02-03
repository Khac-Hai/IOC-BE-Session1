import java.util.Scanner;
public class bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat(firstNumber):");
        int firstNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so thu hai(secondNumber):");
        int secondNumber = Integer.parseInt(sc.nextLine());
        int sum = firstNumber + secondNumber;
        int rest = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;
        System.out.println("Tổng = " +sum);
        System.out.println("Hiệu = " +rest);
        System.out.println("Tích = " +multiplication);
        System.out.println("Thương = " +division);
        System.out.println("Phần dư = "+remainder);
    }
}
