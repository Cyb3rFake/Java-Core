package Exceptions_Lists_Threads_Files.Practice;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

public class LinkOfTheList_66_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Integer> nums = new LinkedList<Integer>();

        while (nums.size()<5){
            int num =scanner.nextInt();
            nums.add(num);
        }

        int sum = 0;                                    //объявляем счетчик эелементов
        Iterator<Integer> n = nums.iterator();          //создаем экземпляр метода Iterator n с типом Integer для списка nums
        while (n.hasNext()){                            //создаем цикл while на количество итераций равное числу элементов списка
            Integer value = n.next();                   //создаем переменнут value типа Integer в нутри цикла в которую передам значение списка на каждой интерации
            sum +=value;                                //складываем в переменную sum значение value на каждой инетрации
        }
        System.out.println(sum);
    }
}
