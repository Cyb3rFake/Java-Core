package Classes_and_Objects.Practice;

import java.util.Scanner;

public class TrackingCustomerData_31_2 {
        public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
            String firstName = read.nextLine();
            String secondName = read.nextLine();
            int age = read.nextInt();
            int roomNumber = read.nextInt();
            Customer customer = new Customer();
            customer.firstName = firstName;
            customer.secondName = secondName;
            customer.age = age;
            customer.roomNumber = roomNumber;
            //set customer's data to object here
            customer.saveCustomerInfo();
        }
    }
    class Customer {
        //add all necessary attributes here
        String firstName;
        String secondName;
        int age;
        int roomNumber;

        public void saveCustomerInfo() {
            System.out.println("First name: " + firstName);
            System.out.println("Second name: " + secondName);
            System.out.println("Age: " + age);
            System.out.println("Room number: " + roomNumber);
        }
    }

