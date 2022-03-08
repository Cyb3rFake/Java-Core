package More_on_Classes.Practice;

public class AnimalLover_47_2 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.swim();
        dog.play();
        cat.swim();
        cat.play();
    }
}

interface Swimmer {
    void swim();                                    //абстрактный метод swim()
}

interface Player {
    void play();                                    //абстрактный метод play()
}

//имплементируем методы из интерфейсов
abstract class Animal implements Swimmer, Player{  //абстрактный класс, наследующий методы из интерфейсов Swimmer Player
}

class Dog extends Animal {                         //класс Dog наследющий методы от абстрактного класса Animal
//Переопределяем методы swim play для класса Dog
    public void swim(){
        System.out.println("Dog is swimming");
    }
    public void play() {
        System.out.println("Dog is playing");
    }
}


class Cat extends Animal {                          //класс Dog наследющий методы от абстрактного класса Animal
    //Переопределяем методы swim play для класса Сat
    public void swim() {
        System.out.println("Cat is swimming");
    }
    public void play() {
        System.out.println("Cat is playing");
    }
}