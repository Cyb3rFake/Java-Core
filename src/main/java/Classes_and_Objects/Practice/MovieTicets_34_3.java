package Classes_and_Objects.Practice;

import java.util.Scanner;

public class MovieTicets_34_3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String movie = read.nextLine();
        int row = read.nextInt();
        int seat = read.nextInt();
        Ticket ticket = new Ticket(movie, row, seat);// создаем экзмпляр класса Tiket в который передаются параметры (movie, row, seat)
        System.out.println("Movie:" +movie);
        System.out.println("Row:" +row);
        System.out.println("Seat:" +seat);
    }
}
    class Ticket {       //Конструктор класс Tiket с переменными movie row seat
    private String movie;
    private int row;
    private int seat;

    public Ticket(String m, int r, int s){ //Метод класса Tiket присваивающие переданные значения переменных m,r,s в переменные movie, seat, row
        movie = m;
        row = r;
        seat = s;
    }
    //методы(геттеры возвращающие полученные значения из переменных movie row seat )
    public String getMovie(){
        return movie;
    }
    public int getRow(){
        return row;
    }
    public int getSeat(){
        return seat;
    }
    }