package Conditionals_and_Loops.Practice;

import java.util.Scanner;

public class MathClass_16_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  number = scanner.nextInt();
        int fact = 1;
        //your code goes here
        int factorial = number;
        while (number > fact){
            factorial *= fact;
            ++fact;
        }
        System.out.print(factorial);
    }

}
