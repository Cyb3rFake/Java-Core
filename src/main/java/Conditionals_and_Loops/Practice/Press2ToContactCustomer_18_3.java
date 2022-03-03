package Conditionals_and_Loops.Practice;

import java.util.Scanner;

public class Press2ToContactCustomer_18_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        do {
            if (number == 1) {
                System.out.println("Language selection");
                number = scanner.nextInt();
            } else if (number == 2) {
                System.out.println("Customer support");
                number = scanner.nextInt();
            } else if (number == 3) {
                System.out.println("Check the balance");
                number = scanner.nextInt();
            } else if (number == 4) {
                System.out.println("Check loan balance");
                number = scanner.nextInt();
            } else if (number != 0)
                number = scanner.nextInt();
        }
        while(number != 0);
        System.out.println("Exit");
    }
}
