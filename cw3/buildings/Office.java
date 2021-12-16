package buildings;

import providers.*;

public class Office extends Building {
    private INet i1;
    private INet i2;
    protected IElectricity e;
    private INet i;
    
    public void connectInternet(INet i) {
        if (i1 == null) {
            i1 = i;
        } else if (i2 == null) {
            i2 = i;
        } else {
            i1 = i2;
            i2 = i;
        }
    }
    int a = 0;
    public int spend(int e, double i) {

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
        if (this.i1 == null && this.i2 == null) {
            a = -4;
        } else if (this.i2 == null) {
            this.i1.pay(money);
        } else {
            this.i1.pay(money / 2);
            this.i2.pay(money / 2);
        }
    }
}
