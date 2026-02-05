package session03;

import java.util.Random;

public class alogorithms {
    public static void main(String[] args) {
        // Thuat toan tim kiem tuyen tinh
        // su dung vong lap for de duyet + kiem tra dieu kien tim kiem voi if
        // tim ra cac so chia het cho 3 trong 1 mang so nguyen

        // tao random 1 mang so nguyen 100 phan tu
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }

        // in mang
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
        // tao mang luu tru 20 so nguyen to dau tien
        // tim va luu 20 so nguyen to do vao mang da tao
        int n = 2;
        int[] primes = new int[20];
        int count = 0;
        while (count < 20) {
            boolean isPrime = true;

            if (n < 2) {
                // ko phai
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        // ko phai so nguyen to
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                primes[count] = n;
                count++;
            }
            n++;
            }
        System.out.println("20 so nguyen to dau tien:");
        for (int i = 0; i < primes.length; i++) {
            System.out.print(primes[i] + " ");
        }
    }
}

