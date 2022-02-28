package com.skillbox;
import java.util.Scanner;
public class SoloLearn_ConditionalsAndLoops {
    public static void main(String[] args){

// _________________Conditional Statements______________________________________________________________________________
//

       /**
        *
        You have $12,000 to buy a car.
        You're given a program which takes the price of car as an input.

        Task
        Output "yes" if the price is lower than or equal to 12,000.

        Sample Input
        11000

        Sample Output
        yes
        */
//        Scanner scanner = new Scanner(System.in);
//        int price = scanner.nextInt();
//        if(price <= 12000) {
//            System.out.println("yes");

        /**
         Students can apply for a scholarship if their average grade is higher than 3.5.
         Write a program that prints “Congratulations” if the student meets the average grade requirement, and “Sorry” if not.

         Sample Input:
         2.9

         Sample Output:
         Sorry
         */
//        Scanner scanner = new Scanner(System.in);
//        double score = scanner.nextDouble();
//        // your code goes here
//        if (score > 3.5) {
//            System.out.print("Congratulations");
//        }
//        else {
//            System.out.print("Sorry");
//        }


// _________________Nested if Statements________________________________________________________________________________

        /**
         * The sales manager decided to give a gift card to the customers whose purchases total more than 15000.
         * On top of this, the customers whose total purchase is above 30000 will receive a second gift card.
         * You are given a program, which takes the purchase amount as input, and print "Gift card" if it is above 15000.
         */

//        Scanner read = new Scanner(System.in);
//        int purchases = read.nextInt();
//
//        if(purchases > 15000){
//            System.out.println("Gift card");
//            //complete the code
//
//            if (purchases > 30000){
//                System.out.println("Gift card");
//            }
//        }


        /**
         * You are an administrator at a football club who must categorize already played games on the team's website.
         * The given program takes 3 inputs:
         * 1. match status - which checks if the match is suspended ("true") or not suspended ("false")
         * 2. your team's score
         * 3. opposing team's score.
         * Complete the program so that if the match is suspended (the 1st input is "true"), it will output "Suspended".
         * If the match is not suspended ( the1st output is false), the following statuses should be set depending on the match result: "Won", "Lost" and "Draw".
         *
         * Sample Input
         * false
         * 3
         * 2
         *
         * Sample Output
         * Won
         */
//        Scanner read = new Scanner(System.in);
//        boolean isSuspended = read.nextBoolean();
//        int ourScore = read.nextInt();
//        int theirScore = read.nextInt();
//        // your code goes here
//        if (isSuspended == false){
//            if (ourScore > theirScore){
//                System.out.print("Won");
//            }
//            if (ourScore == theirScore){
//                System.out.print("Draw");
//            }
//            if (ourScore < theirScore){
//                System.out.print("Lost");
//            }
//        }
//        else{
//            System.out.print("Suspended");
//        }
//    }

//____________________Logical Operators_________________________________________________________________________________
        /**
         * You can win cash by playing the lottery. If the ticket number is a multiple of 10 and 9, the program outputs “You won $200”.
         *
         * If it is a multiple of 4 or 6, the program outputs “You won $50”. In all other cases, there is no prize and the output is “Try again”.
         *
         * Sample Input
         * 11457
         *
         * Sample Output
         * Try again
         *
         * Hint
         * Number a is a multiple of number b, if a%b == 0.
         */

//        Scanner read = new Scanner(System.in);
//        int number = read.nextInt();
//
//
//        //your code goes here
//        if (number % 9 == 0 &&  number % 10 == 0){
//            System.out.print("You won $200");
//        }
//        else{
//            if (number % 4 == 0 || number % 6 == 0){
//                System.out.print("You won $50");
//            }
//            else{
//                System.out.print("Try again");
//            }
//        }

//________________________The switch Statement__________________________________________________________________________

        /**
 * Your robot can recognize your emotions marked with number that represents each of them:
 * 1 - You are happy!
 * 2 - You are sad!
 * 3 - You are angry!
 * 4 - You are surprised!
 * Write a program that takes the emotion number as input and outputs the corresponding message in given format.
 * If the input is an emotion that the program doesn’t know, it should output: "Unknown emotion.".
 *
 * Sample input
 * 1
 *
 * Sample output
 * You are happy!
 */
//        Scanner scanner = new Scanner(System.in);
//        int emotion = scanner.nextInt();
//       /*
//       1 - "You are happy!"
//       2 - "You are sad!"
//       3 - "You are angry!"
//       4 - "You are surprised!"
//       other - "Unknown emotion."
//       */
//
//        // your code goes here
//        switch(emotion){
//            case 1:
//                System.out.print("You are happy!");
//                break;
//            case 2:
//                System.out.print("You are sad!");
//                break;
//            case 3:
//                System.out.print("You are angry!");
//                break;
//            case 4:
//                System.out.print("You are surprised!");
//                break;
//            default:
//                System.out.print("Unknown emotion.");
//        }

//__________________


        /**
 * The switch Expression.
 * The switch expression allows multiple comma-separated values per case and returns a value for the whole switch-case block.
 */
//        int day = 2;
//        String dayType  = switch(day) {
//            case 1, 2, 3, 4, 5 -> "Working day";
//            case 6, 7 -> "Weekend";
//            default -> "Invalid day";
//        };
//        System.out.println(dayType);


//_______________________While Loops____________________________________________________________________________________
        /**
         * While Loops
         *
         *
         * For your math class you need a program to calculate the factorial of a number.
         * You're given a program which takes a number as input.
         *
         * Task
         * Complete the program to calculate the factorial of the given number and output it.
         *
         * Sample input
         * 6
         *
         * Sample output
         * 720
         *
         * Explanation
         * The factorial of a number is equal to the product of all numbers less than or equal to the given number.
         * The factorial of 6 will be 6*5*4*3*2*1 = 720.
         *
         * Hint
         * Use while loop to calculate the factorial of the number.
         */

//********First Solution**********
//        int  n = 9;
//        int c = n;
//        System.out.print("Факториал числа " + n +" = " );
//        while ( c > 1){
//            --c;
//            n *= c  ;
//
//        }
//            System.out.print(n);
//


//********Second Solution***********
//        int  n = 5;
//        int c = 1;
//        int fact = n;
////        System.out.print("Факториал числа " + n +" = " );
//        while ( n > c){
//            fact *= c;
//            c++;
//        }
//            System.out.print(fact);

        /**
 * While Loops
 *
 *
 * A client wants you to write a program that prints all numbers from 1 to the inputted number that are either a multiplier of 3 or end with 3.
 *
 * Sample input
 * 14
 *
 * Sample output
 * 3
 * 6
 * 9
 * 12
 * 13
 */
/*
        int number = 14;
        int c = 1;
        while (number >= c){
            if (c % 10 == 3 || c % 3 == 0){
                System.out.println(c);
            }
            ++c;
        }
*/



//_______________________ For LOOPS____________________________________________________________________________________

        /**
         *for(int x = 1; x <=5; x++) {
         *             System.out.println(x);
         */

        /**
         * For Loops
         *
         *
         * You are given code that takes the number of students who enter the university as input. Let's greet them!
         *
         * Task
         * Complete the program to output "Welcome" for each student.
         *
         * Sample Input
         * 2
         *
         * Sample Output
         * Welcome
         * Welcome
         */

//         int n = 5;
//         for (int x = 1; x <= n; x++){
//             System.out.println("Welcome");
//         }


        /**
         *For Loops
         *
         *
         * You are a game developer and the game you currently working on is a deck dealer which deals 7 cards representing the players’ roles.
         * 5 of them are good guys and 2 of them are bad guys.
         * Write a program that will take the bad guys numbers as input and output all the roles accordingly.
         *
         * Sample Input
         * 1
         * 4
         *
         * Sample Output
         * Bad guy
         * Good guy
         * Good guy
         * Bad guy
         * Good guy
         * Good guy
         * Good guy
         *
         * Explanation
         * The 1st and the 4th role is "Bad guy".
         */

        /*
        int firstBadGuy = 1;
        int secondBadGuy = 4;
        for (int x = 1; x <= 7; x++){
            if (firstBadGuy == x || secondBadGuy ==x){
                System.out.println("Bad guy");
            }
            else{
                System.out.println("Good guy");
            }
        }
*/

//________________Do While Loops________________________________________________________________________________________


        /**
         *public class Program {
         *     public static void main(String[] args) {
         *         int x = 1;
         *         do {
         *             System.out.println(x);
         *             x++;
         *         } while(x < 5);
         *     }
         * }
         */


        /**
         * Do While Loops(Верификация пароля)
         *
         *
         * You're creating a bank security system. The user must insert the correct password in order to access payments.
         * The password is 8819.
         *
         * Task
         * Write a program that will continuously take a password as input and output Write password, until the client inserts the correct password.
         *
         * Sample Input
         * 3332
         * 8819
         *
         * Sample Output
         * Write password
         * Write password
         */


//        Scanner read = new Scanner(System.in);
//        int rpwd;
//        int password = 8819;
//        do {
//            rpwd =read.nextInt();
//            System.out.println("Write password");
//        }while (rpwd != password);
//

        /**
         *Do While Loops(Меню Автоотвтчика)
         *
         *
         * You are creating an automated phone system for bank clients.
         * Number selections should activate the actions noted below as follows:
         * 1 => Language selection
         * 2 => Customer support
         * 3 => Check account balance
         * 4 => Check loan balance
         * 0 => Exit
         *
         * You can use the first 4 commands in a random sequence without interrupting the phone call - only the number 0 does.
         * Write a program that will continuously take a number as input and output the corresponding message, until the client enters 0.
         *
         * Sample Input
         * 1
         * 4
         * 3
         * 0
         *
         * Sample Output
         * Language selection
         * Check loan balance
         * Check the balance
         * Exit
         */


//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        do {
//            //take input and output corresponding message
//        /*
//       1 => Language selection
//       2 => Customer support
//       3 => Check the balance
//       4 => Check loan balance
//       0 => Exit
//       */
//
//            if (number == 1) {
//                System.out.println("Language selection");
//                number = scanner.nextInt();
//            } else if (number == 2) {
//                System.out.println("Customer support");
//                number = scanner.nextInt();
//            } else if (number == 3) {
//                System.out.println("Check the balance");
//                number = scanner.nextInt();
//            } else if (number == 4) {
//                System.out.println("Check loan balance");
//                number = scanner.nextInt();
//            } else if (number != 0)
//                number = scanner.nextInt();
//        }
//        while(number != 0);
//        System.out.println("Exit");


//____________________Do While Loops

/**Do While Loops
 Write a program that takes N numbers as input and outputs the numbers from N to 0, skipping the ones that are multiple of 3.
 Sample Input
 7
 Sample Output
 7
 5
 4
 2
 1
 0
 *
 */
 /*
        int n = 7;
        do {
            if (n % 3 != 0) {
                System.out.println(n);
            }
            --n;
        }while (n >= 0);
        System.out.println("0");
 */

/**
 * Loan Calculator(Калькултятор заемщика)
 *
 * You take a loan from a friend and need to calculate how much you will owe him after 3 months.
 * You are going to pay him back 10% of the remaining loan amount each month.
 * Create a program that takes the loan amount as input, calculates and outputs the remaining amount after 3 months.
 *
 * Sample Input:
 * 20000
 *
 * Sample Output:
 * 10628
 *
 * Here is the monthly payment schedule:
 * Month 1
 * Payment: 10% of 20000 = 2000
 * Remaining amount: 18000
 * Month 2
 * Payment: 10% of 18000 = 1800
 * Remaining amount: 16200
 * Month 3:
 * Payment: 10% of 16200 = 1620
 * Remaining amount: 14580
 */
        int s = 20000;
        int p = 10;
        int m = 0;
        int payment = s;
        int d =0;
        for (int x=1; x<=3; x++){
            payment = payment - (payment / p);
            m = (payment / p);
            System.out.println("Платеж за " +x +"й месяц "+ m);
            System.out.println("           Остаток "+ payment);
            System.out.println("");
            d+=m;
        }
        System.out.println("Всего выплачено = "+ d);
        System.out.println("Оставшаяся сумма = " +(s - d) );


    }
}
