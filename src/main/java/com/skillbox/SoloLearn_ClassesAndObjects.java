package com.skillbox;

import java.util.Scanner;

public class SoloLearn_ClassesAndObjects {

//static class MyClass{
//    public static void sayHello(){
//        System.out.print("Hello World");
//    }
//}


/**
 *  ( ООП ) — стиль программирования, призванный приблизить размышления о программировании к размышлениям о реальном мире .
 *   В ООП каждый объект является независимой единицей с уникальным идентификатором , как и объекты в реальном мире.
 *   Пример:
 *   Яблоко — это объект; так и кружка. Каждый имеет свою уникальную индивидуальность .
 *   Можно иметь две кружки, которые выглядят одинаково, но они все равно являются отдельными уникальными объектами.
 *
 *   Объекты также имеют характеристики , которые используются для их описания.
 *   Например, машина может быть красной или синей, кружка может быть полной или пустой и так далее.
 *   Эти характеристики также называются атрибутами . Атрибут описывает текущее состояние объекта.
 *   В реальном мире каждый объект ведет себя по-своему. Машина движется, звонит телефон и так далее.
 *   То же самое относится и к объектам: поведение зависит от типа объекта.
 *
 *   Класс описывает , каким будет объект, но он отделен от самого объекта.
 *   Другими словами, классы можно описать как чертежи, описания или определения объекта. Вы можете использовать один и
 *   тот же класс в качестве схемы для создания нескольких объектов. Первым шагом является определение класса, который
 *   затем становится образцом для создания объекта. У каждого класса есть имя, и каждый из них используется для
 *   определения атрибутов и поведения .
 *   Другими словами, объект является экземпляром класса.
 *
 */
//_______________________________________________Methods________________________________________________________________
    /**
     * Методы
     *
     * Методы определяют поведение . Метод — это набор операторов, сгруппированных вместе для выполнения операции.
     * System.out.println() — это пример метода.
     * Вы можете определить свои собственные методы для выполнения желаемых задач.
     */

//    public static void main(String[ ] args) {
//    for (int i=0; i<=5; i++) {
//        hello("test args");}
//    }
//    static void hello(String args){
//        System.out.println("Hi suka");
//        System.out.print(args);


//    MyClass.sayHello("Jora");
//    MyClass.sayHello("Klava");
//    }
//
//    class MyClass{
//        static void sayHello(String name){
//                    System.out.println("Hello " +name);
//        }
//    }


//Practice_________________________Methods______________________________________________________________________________
    /**
     * Methods
     *
     *
     * You are creating a robot, "Welcomer 2000", that never fails to greet a single person it encounters.
     * You provide the number of people that will enter the room, and the robot will shout "Welcome" that number of times.
     * The program you are given already takes a number as input and calls the method according provided count.
     * The issue is that the method is incomplete. Fix it.
     *
     * Sample Input
     * 2
     *
     * Sample Output
     * Welcome!
     * Welcome!
     */

    /*
        public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numberOfPeople = read.nextInt();

        for (int i = 0; i < numberOfPeople; i++) {
            welcome();
        }
    }
    public static void welcome() {
        System.out.println("Welcome");

    }
     */


//Practice_________________________Method Parametres____________________________________________________________________
    /**
     * Method Parameters
     *
     * The program you are given takes length and width of a rectangle as input.
     * Complete the method to take them as parameters, then calculate and output the area of the rectangle.
     * Sample Input
     * 4
     * 5
     *
     * Sample Output
     * 20
     */


    /*
    public static void main(String[ ] args) {
        Scanner read = new Scanner(System.in);
        int width = read.nextInt();
        int height = read.nextInt();
        printArea(width, height);
    }

    //complete the method
    public static void printArea(int width, int height) {
        System.out.println(width*height);
    }
    */

//_______________Method Return Types____________________________________________________________________________________

    /**
     * Тип возврата
     *
     * Ключевое слово return может использоваться в методах для возврата значения.
     * Например, мы могли бы определить метод с именем sum , который возвращает сумму двух своих параметров.
     *
     * static int sum(int val1, int val2) {
     * return val1 + val2;}
     *
     * Обратите внимание, что в определении метода мы определили тип возвращаемого значения до того, как определили имя
     * метода. Для нашего метода sum это int , так как он принимает два параметра типа int и возвращает их сумму,
     * которая также является int.
     * <p>
     * Теперь мы можем использовать этот метод в файле main.
     * <p>
     * public static void main(String[ ] args) {
     * int x = sum(2, 5);
     * System.out.println(x);
     * }
     * <p>
     * Поскольку метод возвращает значение, мы можем присвоить его переменной.
     * !Если вам не нужно возвращать какое-либо значение из вашего метода, используйте ключевое слово void .
     * Обратите внимание на ключевое слово void в определении основного метода — это означает, что main ничего не возвращает.
     */

    /*
        // returns an int value 5
             static int returnFive() {  возвращает число 5
             return 5;
             }

        // has a parameter
        static void sayHelloTo(String name) {
          System.out.println("Hello " + name);      печататет hello + параметр(name)
        }

        // simply prints"Hello World!"
        static void sayHello() {
          System.out.println("Hello World!");       печататет hello world
        }
     */


    /* поиск наибольшего из 2 чисел
    public static void main(String[ ] args) {
        int res = max(7, 42);
        System.out.println(res);
    }

    static int max(int a, int b) {
        if(a > b) {
          return a;
        }
        else {
            return b;
        }
    }
     */


//Practice_______So You Think You Can Dance?___________________________________________________________________________

    /**
     * Method Return Types
     *
     *
     * You are an assistant on a TV show where celebrities are dancing and 4 judges evaluate their performance and give them a score between 1 and 10.
     * The program you are given takes the scores as input.
     * Complete the method to take them as parameters, then calculate and return the average score.
     *
     * Sample Input
     * 6.0
     * 4.0
     * 5.0
     * 3.0
     *
     * Sample Output
     * 4.5
     *
     */

    /*
        public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double score1 = read.nextDouble();
        double score2 = read.nextDouble();
        double score3 = read.nextDouble();
        double score4 = read.nextDouble();
        double avgScore = getAverageScore(score1, score2, score3, score4);
        System.out.println(avgScore);

    }

    private static double getAverageScore(double score1, double score2, double score3, double score4) {
      return ((score1+score2+score3+score4)/4);
    }
     */

//______________________________________Creating Classes & Objects______________________________________________________
    /**
     * Для создания собственных пользовательских объектов необходимо сначала создать соответствующие классы. Это можно
     * сделать, щелкнув правой кнопкой мыши папку src в Eclipse и выбрав Create->New->Class. Дайте вашему классу имя и
     * нажмите « Готово », чтобы добавить новый класс в ваш проект:
     *
     * public class Animal{
     *   void bark () {
     *     *     System.out.println («Гав-Гав»);
     *   }
     * }
     *
     * Мы объявили метод bark() в нашем классе Animal .
     * Теперь, чтобы использовать класс и его методы, нам нужно объявить объект этого класса.
     */

//Practice__________Creating Classes & Objects__________________________________________________________________________
    /**
     * Создайте программу для отображения сообщений о загрузке пользователям вашего приложения.
     * Определите класс Loading, который имеет один общедоступный метод LoadingMessage(), который должен печатать «Loading» при вызове.
     * Создайте объект с именем loading и вызовите этот метод.
     */

//    public class Main {
//        public static void main(String[] args) {
//                Loading loading = new Loading();
//            //create a Loading object with the same name
//                loading.LoadingMessage();
//        }
//    }
//
//
//
//    public class Loading {
//        //complete the class, add LoadingMessage() method
//        public static void Load<>
//    }






}