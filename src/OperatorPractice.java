import static java.lang.Math.max;
import static java.lang.Math.sqrt;

public class OperatorPractice {
    public static void main(String[] args) {
        //viet 1 logic khoi tao 3 canh cua 1 tam giac hop le
        //su dung cong thuc heron de tinh dien tich va chu vi cua tam giac(math)
        int a =3; int b = 4; int c = 5;
        int p = a + b + c;
        double S = sqrt(p/2*(p/2-a)*(p/2-b)*(p/2-c));
        System.out.printf("Chu vi hinh tam giac:" + p);
        System.out.printf("Dien tich hinh tam giac:" + S);
        //viet 1 logic khoi tao 3 he so a,b,c cho phuong trinh bac 2 thoa man cos 2 nghiem
        //ap dung cong thuc giai pt bac 2 tinh nghiem cua phuong trinh
        //in cac ket qua ra man hin dung sout()
        a =3;  b = -4;  c = 6;
        double delta = b*b - 4*a*c;
        double x1 = (-b + Math.sqrt(delta))/(2*a);
        double x2 = (-b - Math.sqrt(delta))/(2*a);
        System.out.printf("nghiem x1" +x1);
        System.out.printf("nghiem x2" +x2);
    }
}
