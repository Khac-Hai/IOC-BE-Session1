import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("width = ");
        float width = sc.nextFloat();
        System.out.print("height = ");
        float height = sc.nextFloat();
        float area = 2*(width+height);
        float remainder = width*height;
        System.out.println("Diện tích :" +remainder);
        System.out.println("Chu vi :"+area);
    }
}
