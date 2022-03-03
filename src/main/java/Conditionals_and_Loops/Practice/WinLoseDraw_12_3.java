package Conditionals_and_Loops.Practice;

import java.util.Scanner;

public class WinLoseDraw_12_3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean isSuspended = read.nextBoolean();
        int ourScore = read.nextInt();
        int theirScore = read.nextInt();
        // your code goes here
        if (isSuspended == false){
            if (ourScore > theirScore){
                System.out.print("Won");
            }
            if (ourScore == theirScore){
                System.out.print("Draw");
            }
            if (ourScore < theirScore){
                System.out.print("Lost");
            }
        }
        else{
            System.out.print("Suspended");
        }
    }
}
