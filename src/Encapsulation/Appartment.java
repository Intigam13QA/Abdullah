package Encapsulation;

public class Appartment {
    int costOfHome;
    int internet;
    int gardian;

    public Appartment(int costOfHome, int internet,int gardian) {
        this.costOfHome = costOfHome;
        this.internet = internet;
        this.gardian = gardian;
    }

    public void setCostOfHome(int costOfHome) {
        this.costOfHome = costOfHome;
    }
    public int getCostOfHome() {
        return costOfHome;
    }
    public void setInternet(int internet) {
        this.internet = internet;
    }
    public int getInternet() {
        return internet;
    }

    public void setGardian(int gardian) {
        this.gardian = gardian;
    }
    public int getGardian() {
        return gardian;
    }

}
