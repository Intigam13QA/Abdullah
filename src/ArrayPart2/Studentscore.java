package ArrayPart2;

public class Studentscore {
    public static void main(String[] args) {
        int [][] student = { {68,75,54,80},{100,64,20,50}, {10,35,40,90}};
        int score = 0;
        for (int student1 : student[0]){
            score=(score+student1);

        }
        System.out.println(score/student[0].length);

        int mathscore = 0;
        for (int i = 0; i< student.length;i++){
            mathscore=mathscore+student[i][0];

        }
        System.out.println(mathscore);
    }
}
