package Classes_and_Objects.Practice;


import java.util.Scanner;

public class OrganizingScreenshots_34_2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name = read.next();

        //screenshots
        ScreenShot screenshot1 = new ScreenShot();       //экземпляр класса Screenshot если юзер не ввел название криншота
        ScreenShot screenshot2 = new ScreenShot(name);   //Экземпляр класса Screenshot с заданным названием скриншота

        //outputting the names
        System.out.println(screenshot1.getName());
        System.out.println(screenshot2.getName());
    }
}

    class ScreenShot {
        private String name;

        ScreenShot(String n) { //первый вариант класса принимающий значение name
            name = n;
        }


        ScreenShot() {      //третий вариант класса без параметра значения name
            name = "Screenshot";

        }

        //Setter
        public void setName(String name) { //Класс принимающий значение name
            this.name = name;
        }

        //Getter
        public String getName() { // Класс возвращающий значение name
            return name;
        }
    }
