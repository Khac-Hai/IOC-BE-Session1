package session03;

public class test {
    public static void main(String[] args) {
    int [] arrInt = new int [10];
    int [] arrInt1 = new int[] {1,2,3,4,5,6}; // cu phap day du

    // 2 thanh phan cua mang: Phan tu va vi tri
    // Lay phan tu dua theo vi tri
        System.out.println("Phan tu tai index = 2 la:"+arrInt[2]);
        arrInt[2] = 100;
        System.out.println("Phan tu tai index = 2 la:"+arrInt[2]);

    // mang 2 chieu
        int[][] arr2D = new int [10][5];
        int[][] arr2D1 = {{1,2,3,4,5},{6,7,8,9,10}};
    // phan tu co gia tri = 5
        System.out.println("array"+arr2D1[0][4]);
    }
}
