package session05;

//public class vidu2 {
    // kiểm tra 1 chuỗi người dùng nhập vào có thỏa mãn 1 trong các điều kiện sau đây
//    - ko để trống(chỉ chứa khoảng trắng)
//    - ko chứa kí tự đặc biệt
//    - ko chứa kí tự số
//    - chỉ chứa toàn kí tự số
//    - chỉ chứa toàn kí tự chữ cái(ko phải số, ko phải kí tự đăc biệt)
//}
import java.util.Scanner;

public class vidu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String input = sc.nextLine();
        System.out.println(checkString(input));
        sc.close();
    }

    public static String checkString(String str) {
        if (str.trim().isEmpty()) {
            return "Chuỗi rỗng hoặc chỉ chứa khoảng trắng";
        }
        boolean hasLetter = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                hasLetter = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }
        if (hasSpecial) {
            return "Chuỗi có chứa ký tự đặc biệt";
        } else if (hasLetter && hasDigit) {
            return "Chuỗi chứa cả chữ và số";
        } else if (hasDigit) {
            return "Chuỗi chỉ chứa toàn số";
        } else if (hasLetter) {
            return "Chuỗi chỉ chứa toàn chữ cái";
        }
        return "Chuỗi không xác định";
    }
}
