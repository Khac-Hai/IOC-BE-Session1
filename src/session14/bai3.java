package session14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 1_000_000; // số dư ban đầu
        int minimumBalance = 50_000; // số dư tối thiểu phải duy trì

        System.out.println("Số dư hiện tại: " + balance + " đồng");

        try {
            System.out.print("Nhập số tiền muốn rút: ");
            int withdrawAmount = scanner.nextInt();

            // Kiểm tra số tiền nhập vào có hợp lệ không
            if (withdrawAmount <= 0) {
                System.out.println("Lỗi: Vui lòng nhập số tiền rút lớn hơn 0!");
            } else if (withdrawAmount > balance) {
                System.out.println("Lỗi: Số tiền rút vượt quá số dư!");
            } else if (balance - withdrawAmount < minimumBalance) {
                System.out.println("Lỗi: Tài khoản phải duy trì số dư tối thiểu 50.000 đồng!");
            } else {
                // Rút tiền thành công
                balance -= withdrawAmount;
                System.out.println("Giao dịch thành công!");
                System.out.println("Số tiền đã rút: " + withdrawAmount + " đồng");
                System.out.println("Số dư còn lại: " + balance + " đồng");
            }
        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Vui lòng nhập một số hợp lệ!");
        } finally {
            scanner.close();
        }
    }
}
