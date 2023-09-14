package Constracror;

public class Carpet {
    double cost;
    public Carpet(double c){
        if (c<0){
            this.cost = 0;
        }else {
            this.cost = c;
        }
    }
    public double getcost(){
        return cost;
    }
}
