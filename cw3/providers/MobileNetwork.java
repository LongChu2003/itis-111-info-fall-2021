package providers;

public class MobileNetwork implements INet {
    private String name;
    private double gb;
    private int price;

    public MobileNetwork(String name, double gb, int price) {
        this.name = name;
        this.gb = gb;
        this.price = price;
    }

    public int spendInternet(double gb) {
        int n = 0;
        if (gb <= this.gb) {
            System.out.println("Use " + gb + " Gb from " + name);
            this.gb -= gb;
        } else {
            n = -1;
        }
        return n;
    }

    public void pay(int money) {
        gb += (double)money / price;
    }
}
