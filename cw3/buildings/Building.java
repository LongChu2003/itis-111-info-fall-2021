package buildings;

import providers.*;

public abstract class Building {
    protected IElectricity e;
    private INet i;
    public Building() {}

    public void connectElectricity(IElectricity e) {
        this.e = e;
    }

    public IElectricity getElectricity() {
        return e;
    }

    public void connectInternet(INet i){
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
    abstract public void pay(int money);
}
