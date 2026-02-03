package session08;

public class bai3 {
    public static void main(String[] args) {
        CurrencyConverter.setRate(23500);
        int vndAmount = 117500;
        double usdAmount = CurrencyConverter.toUSD(vndAmount);
        System.out.println("VND: " + vndAmount + " → USD: " + CurrencyConverter.formatUSD(usdAmount));
    }
}

class CurrencyConverter {
    private static double rate;

    public static void setRate(double r) {
        if (r > 0) {
            rate = r;
        } else {
            System.out.println("Tỉ giá phải lớn hơn 0.");
        }
    }

    public static double toUSD(int vnd) {
        if (vnd < 0) {
            System.out.println("Giá trị VND không hợp lệ.");
            return 0;
        }
        return vnd / rate;
    }

    public static String formatUSD(double usd) {
        return String.format("$%,.2f", usd);
    }
}
