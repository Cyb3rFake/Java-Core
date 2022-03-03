package Classes_and_Objects.Practice;

import java.util.Scanner;

public class FriendlyRobot_28_2 {
    public class Main {

        public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
            int numberOfPeople = read.nextInt();

            for (int i = 0; i < numberOfPeople; i++) {
                welcome();
            }
        }
        public static void welcome() {
            System.out.println("Welcome!");

        }
    }
}
