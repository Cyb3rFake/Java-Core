package Conditionals_and_Loops.Practice;

import java.util.Scanner;

public class BoardGamePlayers_17_3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int firstBadGuy = read.nextInt();
        int secondBadGuy = read.nextInt();

        //your code goes here
        for (int x = 1; x <= 7; x++) {
            if (firstBadGuy == x || secondBadGuy == x) {
                System.out.println("Bad guy");
            } else {
                System.out.println("Good guy");
            }
        }

        }
}
