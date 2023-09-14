package MAIN1;

public class ifStatement {
    public static void main(String[] args) {

        int score = 40;
        if (score >= 70) {
            System.out.println("Excelent");
            System.out.println("You passed with grade A, " + "Your score is " + score);
        }
        System.out.println("You are not pass because your score " + score + " under the requirment");

        int sales, bonus;
        double commisionRate, salary;
        salary = 10000;
        sales = 5200;

        if (sales > 5000) {
            bonus = 500;
            commisionRate = 1.12;

            salary = salary * commisionRate + bonus;

        }
        System.out.println("Salary= " + salary);

        int x = 0;
        int y = 20;
        if (y == 20) {
            x = 0;

            System.out.println("x= " + x + "y= " + y);

        }
        double payRate = 1000;
        int hours = 45;
        if (hours > 40) {
            payRate = payRate * 1.5;
        }
        System.out.println("Pay rate is equal to " + payRate + " $");

        int a, b, c;
        a = 10;
        b = 50;
        c = 30;
        if (b == 50 | c >= 100) {
            a = 20;
        }
        System.out.println("a= " + a);
        System.out.println();
        int temp = 75;
        if (temp >= 70 && temp < 80) {
            System.out.println("Ideal Temp");
        }
        System.out.println("Not Ideal Temp");


        int age = 18;
        if (age >= 18) {
            System.out.println("You are eligible to vote, good luck...");

        }
        int first, second, third;
        first = 40;
        second = 8;
        third = 1;
        if (first > second && first > third) {
            System.out.println(first + " is greater");


        }
        if (second > first && second > third) {
            System.out.println(second + " is greater");

        }
        if (third > first && third > second) {
            System.out.println(third + " is greater");

        }

        int n = 8;
        int m = 8;
        if (n == m) {
            System.out.println("numbers are equal");

        }
        if (n != m) {
            System.out.println("numbers are not equal");
        }
        System.out.println();

        int hour = 8;
        if (hour < 12 && hour > 0) {
            System.out.println("Good Morning");
        }
        if (hour >= 12 && hour < 15) {
            System.out.println("Good Afternoon");
        }
        if (hour >= 15 && hour < 24) {
            System.out.println("Good Evening");
        }

        double revenue, price, quantity, discount;
        price = 100;
        quantity = 20;
        revenue = price * quantity;
        discount = 0;

        if (revenue > 5000) {
            discount = revenue * 0.1;
            revenue = revenue - discount;

        }
        System.out.println("Discount is " + discount + " and " + "Revenue is " + revenue);

    }
}









