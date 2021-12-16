package buildings;

import providers.*;

public class Flat extends Building {
    private INet i;

    public void connectInternet(INet i) {
        this.i = i;
    }

    public int spend(int e, double i) {
        int a =0;
        if (this.e == null) {
            a = -1;
        } else if (this.i == null) {
            a = -2;
        } else {
            a= -3;
        }
        return a;
    }

    public void pay(int money) {
    }
}
