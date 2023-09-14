public class task1 {
    public static void main(String[] args) {
        byte b1 = 25;
        byte b2 = -25;
        //byte b3 = 128
        System.out.println("b1 = " + b1);
        System.out.println("b2 =" + b2);

        String s1 = "5", s2;
        System.out.println(s1);
        int a, b, c;
        a = 10;
        b = 20;
        c = a;
        a = b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("      ");
        System.out.println(56 + 4);
        int chairs = 140;
        System.out.println(chairs + 2);
        chairs = chairs + 2;
        System.out.println(chairs);


        int tables = 130;
        int total = tables + chairs;
        System.out.println(total);
        double balance = 1200.50;
        double transaction = 56.44;
        System.out.println(balance - transaction);
        balance = balance - transaction;
        System.out.println(balance);
        System.out.println();
        // Create a variable linesOfCode and assign 50 and print "Lines of code 50"
        //delete 2 lines
        //decrease the value of linesOfCode by 2 and print "Lines of Code 48"

        int linesOfCode = 50;
        System.out.println("Lines of code " + linesOfCode);
        linesOfCode = linesOfCode - 2;
        System.out.println("Lines of code " + linesOfCode);

        //Multiplication
        System.out.println(22 * 2);
        int classes = 5;
        System.out.println(linesOfCode * classes);
        int totalLinesOfCode = linesOfCode * classes;
        System.out.println("Total lines of code = " + totalLinesOfCode);
        System.out.println(81 / 9 + 20 % 3);
        System.out.println(20 % 5);
        System.out.println();
        System.out.println();


        int b12 = 5;
        int b13 = 6;
        System.out.println(9 + b13);
        System.out.println(9 + 1);
        System.out.println();
        System.out.println(2 + 0 + 3 + "cybertek");
        System.out.println("cybertek" + 2 + 0 + 5);
        System.out.println(2 + 0 + 5 + "cybertek " + 2 + 0 + 5);
        System.out.println(2 + 0 + 5 + "cybertek" + (2 + 0 + 1));


        System.out.println();

        double regularwage;
        double basePay = 25.75;
        double regularHours = 40;
        double overTimeWages;
        double overTimePay = 37.5;
        double overTimeHours = 15;
        double totalWage;
        regularwage = basePay * regularHours;
        overTimeWages = overTimePay * overTimeHours;
        totalWage = regularwage + overTimeWages;
        System.out.println("Wages for this week are $" + totalWage);
        System.out.println();

        int regularPrice = 59;
        double discount;
        double salesPrice;
        discount = regularPrice * 0.2;
        salesPrice = regularPrice - discount;
        System.out.println("Regular price: $" + regularPrice);
        System.out.println("Discount amount: $" + discount);
        System.out.println("Sales price: $" + salesPrice);
        System.out.println();

        double monthlyPay = 6000;
        double contribution;
        contribution = monthlyPay * 0.05;
        System.out.println("5 percent is $ " + contribution + " per month");


        contribution = monthlyPay * 0.08;

        System.out.println("5 percent $" + contribution + " per month");

        contribution = monthlyPay * 0.1;

        System.out.println("10 percent $" + contribution + " per month");
        int outcome = 12 + 6 / 3;
        System.out.println(outcome);

        int num1, num2, sum;
        num1 = 200;
        num2 = 100;
        sum = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + sum);


        double fahrenheit = 158.36;
        double celcius = 70.2;
        System.out.println(celcius + " celcius is equal to " + fahrenheit + " fahrenheit");


        System.out.println();
        double perimeter;
        double area;
        double radius = 5.5;
        final double Pm = 3.14;
        perimeter = 2 * radius * Pm;
        area = radius * radius * Pm;
        System.out.println("wjdjnv " + area);
        System.out.println("ejrovjeqojvn " + perimeter);

        int x = 130;
        byte h = (byte) x;
        System.out.println(h);


    }
}
