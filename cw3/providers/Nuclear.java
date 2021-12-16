package providers;

public class Nuclear implements IElectricity {
    public void spendElectricity(int kWh) {
        System.out.println("Spent " + kWh + " kWhs of nuclear energy!");
    }
}
