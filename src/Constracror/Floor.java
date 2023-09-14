package Constracror;

public class Floor {
    double width, length;

    Floor(double wid, double len){
        if ( wid<0){
            this.width = 0;
        }else {
            this.width = wid;
        }
        if (len<0){
            this.length = 0;
        }else {
            this.length = len;
        }
    }
    public double area(){
        return this.width*this.length;
    }

}
