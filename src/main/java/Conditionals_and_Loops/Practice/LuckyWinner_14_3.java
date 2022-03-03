package Conditionals_and_Loops.Practice;

import java.util.Scanner;

public class LuckyWinner_14_3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        //your code goes here
        if (number % 9 == 0 &&  number % 10 == 0){
            System.out.print("You won $200");
        }
        else{
            if (number % 4 == 0 || number % 6 == 0){
                System.out.print("You won $50");
            }
            else{
                System.out.print("Try again");
            }
        }
    }
}
