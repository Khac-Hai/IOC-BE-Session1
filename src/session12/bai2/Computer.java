package session12.bai2;

public class Computer extends Asset {
    private int ram;

    public Computer(String assetCode, String name, double purchasePrice, int ram) {
        super(assetCode, name, purchasePrice);
        this.ram = ram;
    }

    @Override
    public double getMarketValue() {
        return purchasePrice * 0.8; // khấu hao 20%
    }
}
