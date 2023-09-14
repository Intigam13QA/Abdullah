package StaticClassMembers;

public class Calculator {
    int x;
    public static double plus(int num1,int num2){
        return num1 + num2;
    }
    public static double minus(int num1, int num2){
        return num1 - num2;
    }
    public static double multiple(int num1, int num2){
        return num1*num2;
    }
    public static int m(){
        return /*x+*/ 4 ;
    }

}
