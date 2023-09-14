package Constracror;

public class Mouse {
    int numTeeth;
    int numWhiskers;
    int weight;

    public Mouse(int weight) {
        this(20,weight);
        this.weight = weight;
        System.out.println("Java");
    }

    public Mouse(int numTeeth, int weight) {
        this(numTeeth,50,weight);
        this.numTeeth = numTeeth;
        this.weight = weight;
        System.out.println("JS");
    }

    public Mouse(int numTeeth, int numWhiskers, int weight) {
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers;
        this.weight = weight;
        System.out.println("C++");

    }
    public void println(){
        System.out.println(numTeeth + " " + numWhiskers + " " + weight);


    }

}
