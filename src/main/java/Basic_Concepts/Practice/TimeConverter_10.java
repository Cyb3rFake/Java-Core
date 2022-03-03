package Basic_Concepts.Practice;

import java.util.Scanner;

public class TimeConverter_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        System.out.print(days*24*60*60);
    }
}
