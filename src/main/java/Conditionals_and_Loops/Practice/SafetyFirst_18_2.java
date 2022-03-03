package Conditionals_and_Loops.Practice;

import java.util.Scanner;

public class SafetyFirst_18_2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int password = 8819;
        int getPassword;
        do{
            getPassword = read.nextInt();
            System.out.println("Write password");
        }
        while(getPassword != password);
    }
}
