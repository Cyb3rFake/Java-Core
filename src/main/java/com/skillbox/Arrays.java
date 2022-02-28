package com.skillbox;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){

        /**Arrays


         An array is a collection of variables of the same type.
         When you need to store a list of values, such as numbers, you can store them in an array, instead of declaring separate variables for each number.

         To declare an array, you need to define the type of the elements with square brackets.
         For example, to declare an array of integers:
         int[ ] arr;
         The name of the array is arr. The type of elements it will hold is int.

         Now, you need to define the array's capacity, or the number of elements it will hold. To accomplish this, use the keyword new
         int[ ] arr = new int[5];
         The code above declares an array of 5 integers.
         In an array, the elements are ordered and each has a specific and constant position, which is called an index.

         To reference elements in an array, type the name of the array followed by the index position within a pair of square brackets.
         Example:
         arr[2] = 42;
         JAVA
         This assigns a value of 42 to the element with 2 as its index.

         __________________________________________Initializing Arrays__________________________________________________
         Java provides a shortcut for instantiating arrays of primitive types and strings.
         If you already know what values to insert into the array, you can use an array literal.
         Example of an array literal:

         String[ ] myNames = { "A", "B", "C", "D"};
         System.out.println(myNames[2]);
         }
         **/

        //Practice________Fix The Calendar______________________________________________________________________________
        /**
         * Your calendar program should output all the days of week, but it has errors.
         * Change the code so that the program prints the days.
         */

        /*
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (int i = 0; i < 7; i++) {
            System.out.println(days[i]);
        }
        */

        /**
         * Array Length
         *
         *
         * You can access the length of an array (the number of elements it stores) via its length property.
         * Example:
         * int[] intArr= new int[];
         * System.out.println(intArr.length);
         */


        //_______Сложение элементов массива_____________________________________________________________________________
        /*
        int [] myArr  ={5,6,41,4,2,6,73};
        int sum = 0;
        for (int x = 0; x < myArr.length; x++){
            sum += myArr[x];
        }
        System.out.println(sum);
         */


        //Practice________Summing Elements in Arrays____________________________________________________________________
        /**
         *You are given a program that takes the length of the array as the first input, creates it, and then takes the next inputs as elements of the array.
         *
         * Complete the program to go through the array and calculate the sum of the numbers that are multiples of 4.
         */

        /*
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array =  new int[length];
        int sum = 0;
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] % 4 == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
        */

        //_____________Enchated for loop________________________________________________________________________________
        /**
         * The enhanced for loop (sometimes called a "for each" loop) is used to traverse elements in arrays.
         * The advantages are that it eliminates the possibility of bugs and makes the code easier to read.
         * Example:
         */

         /*
            int [] primes = { 2,3,4,5,6};
            for (int t: primes){
                System.out.println(primes[t]);
            }
         */


        //Practice Enhanced for Loop____________________________________________________________________________________
        /**
         * Your company is writing a program for a geometry course.
         * The program takes the number of squares as the first input, creates an array, and then takes the sides of squares as its elements.
         * Write the part of the program that receives a list of square sides and prints the area of those squares for the user.
         *
         * Sample Input
         * 2
         * 3
         * 4
         *
         * Output
         * 9
         * 16
         *
         * Explanation
         * In this example we have 2 squares (the first input) and their sides accordingly - 3 and 4 (the second and the third inputs). The area of the first square is 9 (3*3), the second one 16 (4*4).
         */


//        Scanner scanner = new Scanner(System.in);
//        int length = scanner.nextInt();
//        int[] sides =  new int[length];
//        for (int i = 0; i < length; i++) {
//            sides[i] = scanner.nextInt();
//        }









    }
}
