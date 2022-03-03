package Conditionals_and_Loops.Practice;

import java.util.Scanner;

public class EmotionDetector_15_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int emotion = scanner.nextInt();
        switch(emotion){
            case 1:
                System.out.print("You are happy!");
                break;
            case 2:
                System.out.print("You are sad!");
                break;
            case 3:
                System.out.print("You are angry!");
                break;
            case 4:
                System.out.print("You are surprised!");
                break;
            default:
                System.out.print("Unknown emotion.");
        }
    }
}
