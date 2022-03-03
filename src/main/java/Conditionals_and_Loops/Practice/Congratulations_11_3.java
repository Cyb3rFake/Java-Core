package Conditionals_and_Loops.Practice;

import java.util.Scanner;

public class Congratulations_11_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        // your code goes here
        if (score > 3.5) {
            System.out.print("Congratulations");
        }
        else {
            System.out.print("Sorry");
        }
    }
}
