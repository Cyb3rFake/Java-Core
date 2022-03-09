package Exceptions_Lists_Threads_Files.Practice;


public class Welcome_59_2 {
    public static void main(String[] args) {

        Name name = new Name();
        //устанавливаем приоритет ниже чем у объекта welcome что бы сначала выполнялнялся метод run обьекта welcome
        name.setPriority(4);

        Welcome welcome = new Welcome();
        // устанваливаем приоритет выше чем у Name
        welcome.setPriority(8);

        name.start();
        welcome.start();
    }
}
//extend the Thread class
class Welcome extends Thread{
    public void run() {
        System.out.println("Welcome!");
    }
}

//extend the Thread class
class Name extends Thread{
    public void run() {
        System.out.println("Please enter your name");
    }
}
