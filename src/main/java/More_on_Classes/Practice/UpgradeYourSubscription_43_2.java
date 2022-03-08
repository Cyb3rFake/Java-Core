package More_on_Classes.Practice;

    class Standart{                         //класс Standart использует 2метода выдоа в консоль текста
        protected void draw(){
            System.out.println("Drawing");
        }
        protected void write(){
            System.out.println("Writing");
        }
    }
    class Pro extends Standart{             //класс Pro использует 2метода вывод в консоль текст, а также методы класса Standrt

        protected void useEffect(){
            System.out.println("Using Effects");
        }

        protected void changeResolution(){
            System.out.println("Changing Resolution");
        }
    }

public class UpgradeYourSubscription_43_2 {
    public static void main(String[] args) {
        Standart standart1 = new Standart();
        Pro pro1 = new Pro();
        //методы класса Standart
        standart1.draw();
        standart1.write();
        //методы класса Pro которы так же использует методы класса Standart
        pro1.draw();
        pro1.write();
        pro1.useEffect();
        pro1.changeResolution();
    }

}
