package Conditionals_and_Loops.Practice;

import java.util.Scanner;

public class LetsExplore_14_2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int population = read.nextInt();
        int area = read.nextInt();
        //Complete the code
        if (population <= 10000){
            if (area <= 10000){
                System.out.print("small country");
            }
        }
    }
}
