package Classes_and_Objects.Practice;

import java.util.Scanner;

public class OrganizingScreenshots_34_2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name = read.next();

        //screenshots
        ScreenShot screenshot1 = new ScreenShot();
        ScreenShot screenshot2 = new ScreenShot(name);
        //outputting the names
        System.out.println(screenshot1.getName());
        System.out.println(screenshot2.getName());
    }


class ScreenShot{
    private String name;

    //complete the first constructor
    ScreenShot(){

    }

    //complete the second constructor
    ScreenShot(){

    }

    //Setter
    public void setName(String name){
        this.name = name;
    }

    //Getter
    public String getName(){
        return name;
    }
}
}
