package Classes_and_Objects.Practice;
import java.util.Scanner;
class Converter{                              //создаем класс Converter

    public static String toBinary(int num) {  //созадем метод(toBinary) типа String(так как результатом вычисления будет строка) класса(Converter) , который будет принимать значение из переменной x в
        String binary="";                     //переменную num, производить вычисления в цыкле while и записывать  результат
        while(num > 0) {
            binary = (num%2)+binary;
            num /= 2;
        }
        return binary;                        // возвращаем значение binary как результат
    }
}

public class BinaryConverter_41 {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(Converter.toBinary(x));
    }
}
