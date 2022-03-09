package Exceptions_Lists_Threads_Files.Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayingKeepAwayWith3_61_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> evennums = new ArrayList<Integer>();
        int c = 0;  //счетчик суммы элементов масива
        while ((evennums.size()<3)){
            int num = scanner.nextInt();
            c += num;
            evennums.add(num);

        }
        System.out.println(c / evennums.size());

    }
}
