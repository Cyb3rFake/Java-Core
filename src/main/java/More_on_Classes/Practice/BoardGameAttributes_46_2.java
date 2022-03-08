package More_on_Classes.Practice;

public class BoardGameAttributes_46_2 {
    public static void main(String[] args) {

        Monopoly monopoly = new Monopoly();
        Chess chess = new Chess();
        Battleships battleships = new Battleships();

//        System.out.println(monopoly.getName());
        monopoly.play();        //вызывает метот play от класса monopoly который наследует методы и поля абстрактного класса Game
//        System.out.println("");
//        System.out.println(chess.getName());
        chess.play();           //вызывает метот play от класса chess который наследует методы и поля абстрактного класса Game
//        System.out.println("");
//        System.out.println(battleships.getName());
        battleships.play();     //вызывает метот play от класса monopoly который наследует методы и поля абстрактного класса Game
    }
}

abstract class Game{
    abstract String getName();
    abstract void play();
}

class Monopoly extends Game{
    String getName(){
        return "Monopoly";
    }
    void play(){
        System.out.println("Buy all property");
    }
}

class Chess extends Game{
    String getName(){
        return "Chess";
    }

    void play(){
        System.out.println("Kill the enemy king");
    }
}

class Battleships extends Game{
    String getName(){
        return "BattleShips";
    }
    void play(){
        System.out.println("Sink all ships");
    }
}