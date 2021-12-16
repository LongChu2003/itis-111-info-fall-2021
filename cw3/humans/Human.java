package humans;

import buildings.*;


public class Human {
    private Account account;
    private int limit;

    public Human(Account account, int limit) {
        this.account = account;
        this.limit   = limit;
    }

    public Account getAccount() {
        return account;
    }

    public int use(Building b, int e, double i) {
	int b = 0;
        return b;
    }
}