package humans;

public class Account {
    private int amount;

    public Account(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public int withdraw(int amount) {
        int a =0;
        if (amount >= 0) {
            if (amount <= this.amount) {
                this.amount -= amount;
            } else {
                a = -2;
            }
        } else {
            a = -1;
        }
        return a;
    }
}
