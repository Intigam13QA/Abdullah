package Inheritance;

public class FinalExsam extends GradeActivity {
    private int numQuestion;
    private double pointEach;
    private int numMised;

    public FinalExsam(int numQuestion, int numMised) {
        double numericScore;
        this.numMised = numMised;
        this.numQuestion = numQuestion;
        pointEach = 100 / numQuestion;
        numericScore = 100 - (numMised * pointEach);
        setScore(numericScore);

    }
}
