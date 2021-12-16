public class Candle {
    boolean state;
    int length;

    // задаётся длина свечи
    public Candle(int length) {
        this.length = length;
    }

    // зажечь и потушить
    public void turnOn()  {
        if (length > 0) {
            state=true;
        }
    }
    public void turnOff() {
        state=false; }

    // либо горит, либо нет
    // если горит, то длина уменьшается на 1
    // если длина стала 0 - то больше не горит
    public boolean getState() {
        if (state) { length--; }
        if (length <= 0) { state=false; }
        return state;
    }

}