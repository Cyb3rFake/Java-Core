package Exceptions_Lists_Threads_Files.Practice;

import java.util.Scanner;

public class CategoryHandling_57_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        String[] categories ={"PCs", "Notebooks", "Tablets", "Phones", "Аccessories"};

        try {
            System.out.println(categories[choice]); //выполняем действие(вывод элемента(choice) массива categories
        }
        catch(Exception e){                         //определяем условия исключения
            System.out.println("Wrong Option");     //если действие try{...} не выполняется, то в консоль выведется "Wrong Option"
        }




    }
}
