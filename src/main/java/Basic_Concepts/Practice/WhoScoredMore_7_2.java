package Basic_Concepts.Practice;

import java.util.Scanner;

public class WhoScoredMore_7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //taking initial score
        int initScore = scanner.nextInt();
        int scoreTom = initScore;
        int scoreBob = initScore;
        System.out.println("Round 1 results:");
        //fix

        System.out.println(++scoreTom);
        System.out.println(--scoreBob);
    }
}
