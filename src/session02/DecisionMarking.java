package session02;

import java.util.Scanner;

public class DecisionMarking {
    public static void main(String[] args) {
        // if,else if, else
        // điều kiện phải là 1 biểu thức trả về kiểu boolen
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Nhap gia tri cua a:");
        a =  sc.nextInt();
        if (a>0){
            System.out.println("A lon hon 0");
        }
        else if (a>-10){
            System.out.println("A lon hon 10");
        }
        else {
            System.out.println("A lon hon 0");
        }
    // Swith
    // Bieu thuc xet dieu kien phai tra ve gia tri: number,numeric,char.string
    }
}

