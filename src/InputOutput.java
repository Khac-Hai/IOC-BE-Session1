import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap 1 so nguyen");
        int number = Integer.parseInt(sc.nextLine());
        System.out.printf("Number" + number);
        String name = "Nguyen Van A";
        sc.nextLine();
        System.out.printf("Nhap ten cua ban:");
        name = sc.nextLine();
        System.out.printf("Name" + name);
    }
}
