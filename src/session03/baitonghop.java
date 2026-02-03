package session03;

import java.util.ArrayList;
import java.util.Scanner;

public class baitonghop {
    public static void main(String[] args) {
        // cho menu chuc nang sau:
        //-----menu-------
        //1. nhap so luong phan tu can khoi tao (kich thuoc va gia tri)
        //2. tim  va in ra gia tri max min
        //3. tim gia tri lon thu 2
        //4. tim ra cac so chinh phuong trong bang
        //5. tinh tong luy thua bac 3 cua cac so trong mang
        //6. thoat

        // luu y: phai chon chuc nang 1 truoc moi thuc hien 2,3,4,5
        Scanner sc = new Scanner(System.in);
        int choice;
        int[] array = null;
        while (true) {
            System.out.println("\n====== MENU ======");
            System.out.println("1. nhap so luong phan tu can khoi tao");
            System.out.println("2. tim  va in ra gia tri max min");
            System.out.println("3. tim gia tri lon thu 2");
            System.out.println("4. tim ra cac so chinh phuong trong bang");
            System.out.println("5. tinh tong luy thua bac 3 cua cac so trong mang");
            System.out.println("6. thoat");
            System.out.print("Lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhap so luong phan tu:");
                    int n = sc.nextInt();
                    array = new int[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhap so luong phan tu["+ i + "]:");
                        array[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    if(array == null){
                        System.out.println("Chon chuc nang 1 trc");
                    }else {
                        int max = array[0];
                        int min = array[0];
                        for (int x : array) {
                            if (x > max) {max=x;};
                            if (x < min) {min=x;};
                        }
                        System.out.println("Max = " + max + " Min = " + min);
                    }
                    break;
                case 3:
                    if(array == null){
                        System.out.println("Chon chuc nang 1 trc");
                    } else{
                        int max = array[0];
                        int secondMax = Integer.MIN_VALUE;
                        for (int x : array) {
                            if (x > max) {
                                secondMax=max;
                                max=x;
                            }else if (x > secondMax && x < max) {
                                secondMax=x;
                            }
                        }
                        if(secondMax == Integer.MIN_VALUE){
                            System.out.println("khong co gia tri lon thu 2");
                        }else {
                            System.out.println("gia tri lon thu 2:"+secondMax);
                        }
                    }
                    break;
                case 4:
                    if(array == null){
                        System.out.println("Chon chuc nang 1 trc");
                    }else {
                        System.out.print("Cac so chinh phuong trong bang:");
                        for(int x : array){
                            int sqrt = (int)Math.sqrt(x);
                            if(sqrt * sqrt == x){
                                System.out.print(x+ " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    if(array == null){
                        System.out.println("Chon chuc nang 1 trc");
                    }else {
                        long sum = 0;
                        for(int x : array){
                            sum+=Math.pow(x,3);
                        }
                        System.out.println("Tong luy thua bac 3 ="+sum);
                    }
                break;
                case 6:
                    System.out.println("Thoat");
                    break;

                default:
                    System.out.println("Lua chon khong hop le");
            }

        }


    }
}
//BTVN Nâng Cao
// -------menu-------
//1. Hiển thị danh sách sinh viên
//2. Thêm mới sinh viên
//3. Cập nhật thông tin tên
//4. Xóa sinh viên theo vị trí