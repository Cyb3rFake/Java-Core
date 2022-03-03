package Conditionals_and_Loops.Practice;

import java.util.Scanner;

public class LoyalCustomers_12_2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int purchases = read.nextInt();

        if(purchases > 15000){
            System.out.println("Gift card");
            //complete the code

            if (purchases > 30000){
                System.out.println("Gift card");
            }
        }
    }
}
