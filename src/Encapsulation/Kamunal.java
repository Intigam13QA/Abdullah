package Encapsulation;

public class Kamunal {
    private int gas;
    private int electric;
    private int water;

    public Kamunal(int gas, int electric, int water) {
        this.gas = gas;
        this.electric = electric;
        this.water = water;
    }
    public void setGas(int gas) {
        this.gas = gas;
    }
    public int getGas() {
        return gas;
    }

    public void setElectric(int electric) {
        this.electric = electric;
    }
    public int getElectric() {
        return electric;
    }

    public void setWater(int water) {
        this.water = water;
    }
    public int getWater() {
        return water;
    }

}
