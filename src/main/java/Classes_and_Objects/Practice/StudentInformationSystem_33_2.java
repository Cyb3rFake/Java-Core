package Classes_and_Objects.Practice;

import java.util.Scanner;

public class StudentInformationSystem_33_2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name = read.nextLine();
        int age = read.nextInt();
        Student student = new Student();
        student.name = name;
        student.setAge(age);  //set the age via Setter:done



        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.getAge());
    }


    static class Student {

        public String name;
        private int age;

        public int getAge() {
            return age;

        }

        public void setAge(int age) {  //complete Setter:done
            if (age < 0) {
                System.out.println("Invalid age");
                this.age = 0;
            }
            else {
                this.age=age;
            }

        }
    }
}