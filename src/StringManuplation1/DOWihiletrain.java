package StringManuplation1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class DOWihiletrain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num from 1-9");
        int num = sc.nextInt();
        int got = 5;


        int attemp = 0;


            while (num >= 1 && num <= 9) {

                if (num == got) {
                    System.out.println("You got it");
                    break;

                } else {

                    System.out.println("Try again");



                }
                attemp++;
                if (attemp==3){
                    break;
                }


            }

        }
    }

