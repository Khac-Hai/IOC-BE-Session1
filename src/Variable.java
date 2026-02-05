public class Variable {
    public static void main(String[] args) {
        int number = 10;
        float point= 7.5f;
        double mark = 7.5;
        System.out.printf("Gia tri cua number = " + number);
        System.out.printf("Gia tri cua point = " + point);
        System.out.printf("Gia tri cua mark = " + mark);
        final byte choice = 10;
        System.out.printf("Gia tri cua choise = " + choice);
        point = 10.5f;
        point = 10/3;
        boolean check = true;
        mark = number;
        number = (int) mark;
        point -= 1.5;// point = point - 1.5;
        // toan tu so sanh
        // toan tu logic: || ,&&, !
        boolean result = true||false||2 > 3||false; // true
        boolean rs = 2>3 && 3>4 && 4>5; // flase
        boolean not = !true; // flase

    }
}
