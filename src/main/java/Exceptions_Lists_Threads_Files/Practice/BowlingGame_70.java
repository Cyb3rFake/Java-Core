package Exceptions_Lists_Threads_Files.Practice;
import javax.swing.text.html.parser.Entity;
import java.util.*;

class Bowling {
    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
    //your code goes here
    public void getWinner(){
        int maxScore = Collections.max(players.values());              //находим максимальное значение values В HashMap
        for (Map.Entry<String, Integer> entry : players.entrySet()) {  //создаем цикл, который проходит по всем значения HashMap
            if (entry.getValue().equals(maxScore)) {                   //на каждой итерации цикла выполняется сравнение значения с максимальным
                System.out.println(entry.getKey());                    //в случае совпадения выводим в консоль соответствующие значение ключа
             }
            }
        }
    }


public class BowlingGame_70 {
    public static void main(String[ ] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
    }
}
