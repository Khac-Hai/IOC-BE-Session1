package session05;

public class bai2 {
    public static void main(String[] args) {
        int times = 100000; // giảm số lần để chạy nhanh hơn

        long start = System.currentTimeMillis();
        String s = "Hello";
        for (int i = 0; i < times; i++) {
            s += "World";
        }
        System.out.println("String: " + (System.currentTimeMillis() - start) + " ms");

        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < times; i++) {
            sb.append("World");
        }
        System.out.println("StringBuilder: " + (System.currentTimeMillis() - start) + " ms");

        start = System.currentTimeMillis();
        StringBuffer sf = new StringBuffer("Hello");
        for (int i = 0; i < times; i++) {
            sf.append("World");
        }
        System.out.println("StringBuffer: " + (System.currentTimeMillis() - start) + " ms");
        System.out.println("\nNhận xét:");
        System.out.println("- String: Không hiệu quả khi nối chuỗi nhiều lần do tạo ra nhiều đối tượng mới.");
        System.out.println("- StringBuilder: Hiệu quả và nhanh, phù hợp cho xử lý chuỗi trong một luồng.");
        System.out.println("- StringBuffer: An toàn với đa luồng, nhưng có thể chậm hơn do đồng bộ hóa.");
    }
}
