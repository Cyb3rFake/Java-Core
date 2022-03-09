package Exceptions_Lists_Threads_Files.Practice;

import java.util.ArrayList;
import java.util.Collections; //добавляем метод Collections
import java.util.Scanner;

public class MinimumAndMaximum_65_2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);

        while (nums.size()<5){
            int num = scanner.nextInt();
            nums.add(num);                          //добваляем введеное число в список
        }
       System.out.println(Collections.max(nums));   //выводим максимальное число списка
       System.out.println(Collections.min(nums));   //выводим минимальное число списка
    }
}
