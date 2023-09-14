package ArrayPart2;

import java.util.Arrays;

public class TwoDString {
    public static void main(String[] args) {
        String students [] [] = { {"Tom","Ceck","Cery"} ,
            {"Aysel", "Asif","Qasim"} ,
            {"Gulchohre","Sonbahar","Guldeste"} };
        for (int r = 0; r<students.length; r++){
            for (int c = 0; c < students[r].length; c++){
                if (r==0){
                    System.out.println(students[r][c]+" is first class students");


                } else if (r==1) {
                    System.out.println(students[r][c]+" is second class students");
                } else if (r==2) {
                    System.out.println(students[r][c]+" is third class students");
                }
            }
        }

    }
}
