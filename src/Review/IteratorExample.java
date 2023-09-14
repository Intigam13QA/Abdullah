package Review;

import java.io.*;
import java.util.*;

public class IteratorExample {
    static int a = 5;
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(100, 2, 200, 3000, 40, 500, 300, 400, 300));
        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()){
            if (it.next()>300){
                it.remove();
            }
            // System.out.println(nums);
        }
        /*FileReader file = new FileReader("text.txt");
        BufferedReader read = new BufferedReader(file);
        System.out.println(read.readLine());*/

        Scanner scan = new Scanner(new FileReader("text.txt"));
        while (scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }

        FileWriter file2 = new FileWriter("FileWrite.txt");
        BufferedWriter writer = new BufferedWriter(file2);
        writer.write("Alhamdullilah");
        writer.write("\nFor Everything");
        writer.close();

        Collection frut = new ArrayList<>(Arrays.asList("apple", "apple", "apple", "banana"));


        String name1 = new String("Abdullah");
        for (char c : name1.toCharArray()) {
            System.out.print(c);
        }
        System.out.println("name1 = " + name1);


        StringBuilder name2 = new StringBuilder("Ali");
        System.out.println("name2.reverse() = " + name2.reverse());

        StringBuffer name3 = new StringBuffer("Artur");
        System.out.println("name3.capacity() = " + name3.capacity());

        System.out.println("###########");

       /* for (int i = 0; i<3 ; i++){
            for (int j =3; j>=0; j--){
                if (i==j){
                    continue;
                    System.out.print(i+" "+j);
                }

            }
        }*/


    }
}
