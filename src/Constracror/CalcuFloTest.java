package Constracror;

public class CalcuFloTest {
    public static void main(String[] args) {
        /*first solution

        Floor f = new Floor(4,5);
        Carpet c = new Carpet(5.0);



        CalculateFlor val = new CalculateFlor(f,c);
        System.out.println(val.getTotalCost());
     */
        // second solutio

        CalculateFlor val = new CalculateFlor(new Floor(4,5), new Carpet(5));
        System.out.println(val.getTotalCost());
    }


}

