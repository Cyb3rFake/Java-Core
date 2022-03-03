package Conditionals_and_Loops.Practice;

import java.util.Scanner;

public class NoMoreThrees_18_4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        //your code goes here
        do {
            if (number % 3 != 0) {
                System.out.println(number);
            }
            --number;
        }while (number >= 0);
        System.out.println("0");
    }
}
