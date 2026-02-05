package session03;

import java.util.Scanner;

public class vidu1 {
    public static void main(String[] args) {
        // taoj mang luu tru danh sach diem thi cua 10 muon hocj nhapj tu ban phim
        // duyet mang thuc hien tinh diem trung binh, diem cao nhat, diem thap nhat cua sinh vien
        Scanner sc = new Scanner(System.in);
        double[] diem = new double[10];
        double tong = 0;
        double max, min;
        System.out.println("Nhap diem 10 mon hoc:");
        for (int i=0;i< diem.length;i++){
            System.out.print("Mon"+(i+1)+":");
            diem[i]=sc.nextDouble();
        }
        max = min=diem[0];
        for (int i = 0; i < diem.length; i++) {
            tong += diem[i];
            if (diem[i] > max) max = diem[i];
            if (diem[i] < min) min = diem[i];
        }
        double trungbinh = tong/diem.length;
        System.out.println("\nDiem trung binh:"+trungbinh);
        System.out.println("Diem cao nhat:"+max);
        System.out.println("Diem thap nhat:"+min);
        sc.close();


    }
}
