package Conditionals_and_Loops.Practice;

import java.util.Scanner;

public class BeingChoosy_16_3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        int c = 1;
        while (number >= c){
            if (c % 10 == 3 || c % 3 == 0){
                System.out.println(c);
            }
            ++c;
        }
    }

}
