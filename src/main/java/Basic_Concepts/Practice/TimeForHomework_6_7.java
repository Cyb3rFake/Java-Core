package Basic_Concepts.Practice;

import java.util.Scanner;

public class TimeForHomework_6_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int math = scanner.nextInt();
        int history = scanner.nextInt();
        int geometry = scanner.nextInt();

        //your code goes here
        int sum = math + history + geometry;
        System.out.print(sum/60+"\n"+sum%60);
    }
}
