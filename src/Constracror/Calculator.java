package Constracror;

public class Calculator {
    int num1;
    int num2;
    String st;
    Calculator(){
        this.num1 = 5;
        this.num2 = 10;
    }
    Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    Calculator(int num1, int num2,String st){
        this.num1 = num1;
        this.num2 = num2;
        this.st = st;
    }

    public int add(){
        return this.num1 + this.num2;
    }
    public int reduces(){
        int sum;
        if (this.num1>this.num2){
            sum = this.num1 - this.num2;
        }else {
            sum = this.num2 - this.num1;
        }
        return sum;
    }
}
