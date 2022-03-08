package More_on_Classes.Practice;

import java.util.Scanner;

public class Shapes_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}

abstract class Shape{
    double width;                           //обьявляем тип переменной width дробным
    abstract void area();
}
//создаем класс Square(квадрат) наследующий методы от абстрактного класса Shape
class Square extends Shape{
    //создаем подкласс Square принимающий значение x для вычисления полщади квадрата
    public Square(int x) {
        width = x * x;
    }
    // переопределяем метод area для вывода полщади квадрата вычисленной в подклассе Square
    @Override
    void area() {
        System.out.println((int)(width)); // используем приведение типа для перевода результата вычилсения double в int
    }
}
//аналогичные действия для Circle(круг)
class Circle extends Shape{
    public Circle(double y) {
        width = (Math.PI * y * y);

//        double v = Math.PI * y * y;
    }

    @Override
    void area() {
        System.out.println(width);
    }
}