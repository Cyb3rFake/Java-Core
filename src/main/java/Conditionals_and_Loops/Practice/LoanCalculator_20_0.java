package Conditionals_and_Loops.Practice;

import java.util.Scanner;

public class LoanCalculator_20_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        //your code goes here

        int s = amount;
        int p = 10;
        int m = 0;
        int payment = s;
        int d =0;
        int sum = 0;
        for (int x=1; x<=3; x++)
        {
            payment = payment - d;
            d = payment * 10/100;
            m = payment - d;
            sum +=d;
        }
        System.out.println(s - sum);
    }
}
