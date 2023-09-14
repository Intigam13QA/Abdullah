package MAIN1;

public class ifelseststement {
    public static void main(String[] args) {

        int room = 139;
        if (room >= 1 && room <= 12) {
            System.out.println("Room is eligibl");
        } else if (room == 13) {
            System.out.println("Room is not eligibl");
        } else if (room > 13 && room < 15) {
            System.out.println("Room is eligibl");
        } else if (room >= 18 && room <= 100) {
            System.out.println("Room is not eligibl");
        } else {
            System.out.println("Not valid room");
        }
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        if (num1 > num2 && num1 > num3) {
            System.out.println("Number 1: " + num1 + " greater than other numbers");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Number 2: " + num2 + " greater than other numbers");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Number 3: " + num3 + " greater than other numbers");
        } else {
            System.out.println("in valid number");
        }
        int mark = 90;
        if (mark < 60) {
            System.out.println("Fail");
        } else if (mark >= 60 && mark < 90) {
            System.out.println("Pass");
        } else if (mark > 90) {
            System.out.println("Passed with Distinction");
        } else {
            System.out.println("error 404");
        }
        int math = 70;
        int chemistry = 89;
        double biology = 67;
        double average = (math + chemistry + biology) / 3;
        System.out.println("Average is " + average);

        if (average >= 0 && average <= 59) {
            System.out.println("F");
        } else if (average >= 60 && average <= 69) {
            System.out.println("D");
        } else if (average >= 70 && average <= 79) {
            System.out.println("C");
        } else if (average >= 80 && average <= 89) {
            System.out.println("B");

        } else if (average >= 90 && average <= 100) {
            System.out.println("A");
        }
        System.out.println("**********************************");
        int n1 = 10;
        int n2 = 100;
        int n3 = 90;

        if (n1 > n2 && n1 > n3) {
            System.out.println("N1 is greater");

        } else {
            if (n2 > n3) {
                System.out.println("N2 is greater");
            } else {
                if (n3 > n2) {
                    System.out.println("N3 is greater");
                } else {
                    System.out.println("invalid");
                }
            }


        }
    }
}

