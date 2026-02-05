package session02;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap weight:");
        double weight = sc.nextDouble();
        System.out.print("Nhap height:");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);
        if (bmi < 16) {
            System.out.println("Gay do 3");
        }
        else if (bmi >= 16 && bmi < 16.9) {
            System.out.println("Gay do 2");
        }
        else if (bmi >= 17 && bmi < 18.4) {
            System.out.println("Gay do 1");
        }
        else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Binh Thuong");
        }
        else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Tien beo phi");
        }
        else if (bmi >= 30 && bmi < 34.9) {
            System.out.println("Beo phi do I");
        }
        else if (bmi >= 35 && bmi < 39.9) {
            System.out.println("Beo phi do II");
        }
        else if (bmi >= 40 ) {
            System.out.println("Beo phi do III");
        }
    }
}
