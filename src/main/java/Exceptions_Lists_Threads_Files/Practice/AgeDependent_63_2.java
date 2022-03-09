package Exceptions_Lists_Threads_Files.Practice;

import java.util.HashMap;
import java.util.Scanner;

public class AgeDependent_63_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> ages = new HashMap<String, Integer>();
        ages.put("David", 22);
        ages.put("Tom", 23);
        ages.put("Robert", 32);
        ages.put("Alice", 21);
        ages.put("Sophie", 19);
        ages.put("Maria", 24);
        ages.put("John", 28);

        String[] nameArr = new String[ages.size()]; //создаем массив размера HashMap (ages.size()) - 7 элементов.
        nameArr = ages.keySet().toArray(nameArr);   //заполняем массив(nameArr), состоящий строк, ключами(keySet) из HashMap ages, получаем массивиз значений()

        int ageLimit = scanner.nextInt();           //получаем числовое значение для сравнения значений от пользователя
        for(String emp:nameArr) {                   //создаем цикл emp выполняющий итерации по массиву из строк nameArr
            if (ages.get(emp)<ageLimit){            //создаем условие для сравнения значения ключей HashMap(ages.get(emp) с числом ageLimit
                ages.remove(emp);                   //удаляем пары(ключ-значени) которые не выполняют условие.
            }
        }


        System.out.println(ages);
//        System.out.println(nameArr);
    }
}
