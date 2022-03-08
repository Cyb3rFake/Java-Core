package More_on_Classes.Practice;

import java.util.Scanner;

public class Wellcome_42_2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();

        Pupil pupil = new Pupil();
        pupil.setAge(a);
    }

}

    class Pupil {
        private int age;
        public void setAge(int a){if (a > 6){
                age = a;
                System.out.println("Wellcome");
            }
            else {
                System.out.println("Sorry");
            }

/*        ----Не проходит проверку на сайте
            if (a < 6){
                System.out.println("Sorry");
            }
            else {

                System.out.println("Welcome");
            }

 */
            }




        public int getAge(){
            return age;
        }
    }
