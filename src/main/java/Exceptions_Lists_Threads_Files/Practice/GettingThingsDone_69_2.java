package Exceptions_Lists_Threads_Files.Practice;

import java.io.File;
import java.util.*;
public class GettingThingsDone_69_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {                                           //создаем обработчик исключений
            Formatter f = new Formatter("d:\\tasks.txt");     //создаем экземпляр класса Formatter с именем f который создает файл
            int count = 0;
            while ((count<3)){                          //созадем цикл который делает 3 записи в файлей tasks.txt
                //there
                f.format(input.nextLine()+"\n");        //делаем запись в файл ставим
                count++;
            }
            f.close();
        }
        catch (Exception e) {                           //при получении ошибки пользователю выводится сообщение об ошибке
            System.out.println("Error");
        }
        readFile();                                     //вызываем метод readFile()
    }

    public static void readFile(){                      //создаем  метод для чтения файл
        try {
            File x = new File("d:\\tasks.txt");    //создаем экземпляр класса для чтения файла tasks.txt
            Scanner sc = new Scanner(x);
            while (sc.hasNext()) {                     //создаем цикл, каждая итерация которого выводит строчку прочитанную из файла в консоль
                System.out.println(sc.next());         //построчно выводим содержимое файла
            }
            sc.close();
        }
        catch (Exception e) {
            System.out.println("Error");
        }
    }
}
