package More_on_Classes.Practice;

public class HowManyBullets_52_3 {
    public static void main(String[] args) {
        NewPlayer player1 = new NewPlayer(Difficulty.EASY);
        NewPlayer player2 = new NewPlayer(Difficulty.MEDIUM);
        NewPlayer player3 = new NewPlayer(Difficulty.HARD);
    }
}

enum Difficulty{
    EASY, MEDIUM, HARD
}

class NewPlayer{  //не компилируется если отставить класс public????
    NewPlayer(Difficulty diff){
        //your code goes here
        switch (diff){
            case EASY -> System.out.println("You have 3000 bullets");
            case MEDIUM -> System.out.println("You have 2000 bullets");
            case HARD -> System.out.println("You have 1000 bullets");
        }
    }
}

