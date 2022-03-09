package Exceptions_Lists_Threads_Files.Practice;

import java.util.LinkedList;
import java.util.Scanner;

public class PracticeMakesPerfect_62_2 {
//MY SOLUTION
//    public static void main(String[] args) {
//        Scanner scanner =new Scanner(System.in);
//        LinkedList<String> words = new LinkedList<String>();
//        int i=0;
//        while (i<5){
//            String word = scanner.nextLine();
//            i++;
//            if (word.length() > 4){
//                words.add(word);
//                System.out.println(word);
//            }
//        }
//    }


    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        LinkedList<String> words = new LinkedList<String>();
        int i=0;
        while (words.size()<5){
            String word = scanner.nextLine();
            words.add(word);
        }
            for (String s: words){
                if (s.length()>4){
                    System.out.println(s);
                }
            }
    }
}



