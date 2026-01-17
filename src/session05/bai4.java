package session05;

import java.util.Random;
import java.util.Scanner;

public class bai4 {
    private static final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            sb.append(CHARS.charAt(rnd.nextInt(CHARS.length())));
        }
        System.out.println("Chuỗi ngẫu nhiên: " + sb.toString());
        sc.close();
    }
}
