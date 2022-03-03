package Conditionals_and_Loops;

public class All_Practice_commented {
    public static void main(String[] args){
/*11.2
Scanner scanner = new Scanner(System.in);
       int price = scanner.nextInt();
       //complete the code
       if(price <= 12000) {
            System.out.println("yes");

       }
 */

/*11.3
       Scanner scanner = new Scanner(System.in);
       double score = scanner.nextDouble();
       // your code goes here
       if (score > 3.5) {
           System.out.print("Congratulations");
       }
       else {
           System.out.print("Sorry");
       }
 */

/*12.2
Scanner read = new Scanner(System.in);
       int purchases = read.nextInt();

       if(purchases > 15000){
        System.out.println("Gift card");
        //complete the code

            if (purchases > 30000){
                System.out.println("Gift card");
       }
        }
 */

/*12.3
       Scanner read = new Scanner(System.in);
       boolean isSuspended = read.nextBoolean();
       int ourScore = read.nextInt();
       int theirScore = read.nextInt();
       // your code goes here
        if (isSuspended == false){
            if (ourScore > theirScore){
               System.out.print("Won");
            }
            if (ourScore == theirScore){
                System.out.print("Draw");
            }
            if (ourScore < theirScore){
               System.out.print("Lost");
            }
        }
        else{
            System.out.print("Suspended");
        }
 */

/*14.2
       Scanner read = new Scanner(System.in);
       int population = read.nextInt();
       int area = read.nextInt();
        //Complete the code
        if (population <= 10000){
           if (area <= 10000){
               System.out.print("small country");
           }
        }
 */

/*14.3
       Scanner read = new Scanner(System.in);
       int number = read.nextInt();
       //your code goes here
       if (number % 9 == 0 &&  number % 10 == 0){
            System.out.print("You won $200");
       }
        else{
            if (number % 4 == 0 || number % 6 == 0){
            System.out.print("You won $50");
            }
             else{
            System.out.print("Try again");
            }
        }
 */

/*15.2
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
 */

/*16.2
	    Scanner scanner = new Scanner(System.in);
            int  number = scanner.nextInt();
            int fact = 1;
            //your code goes here
            int factorial = number;
            while (number > fact){
                factorial *= fact;
                ++fact;
            }
        System.out.print(factorial);
    }
 */

/*16.3
       Scanner read = new Scanner(System.in);
       int number = read.nextInt();
         int c = 1;
        while (number >= c){
            if (c % 10 == 3 || c % 3 == 0){
                System.out.println(c);
            }
            ++c;
        }
   }
 */

/*17.2
	   Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
               for (int x = 1; x <= n; x++){
             System.out.println("Welcome");
         }
 */

/*17.3
Scanner read = new Scanner(System.in);
       int firstBadGuy = read.nextInt();
       int secondBadGuy = read.nextInt();

       //your code goes here
       for (int x = 1; x <= 7; x++){
           if (firstBadGuy == x || secondBadGuy ==x){
               System.out.println("Bad guy");
           }
           else{
               System.out.println("Good guy");
           }
       }
 */

/*18.2
	   Scanner read = new Scanner(System.in);
           int password = 8819;
           int getPassword;
           do{
               getPassword = read.nextInt();
               System.out.println("Write password");
           }
            while(getPassword != password);
 */

/*18.3
Scanner scanner = new Scanner(System.in);
       int number = scanner.nextInt();
       do {
       if (number == 1) {
                System.out.println("Language selection");
                number = scanner.nextInt();
            } else if (number == 2) {
                System.out.println("Customer support");
                number = scanner.nextInt();
            } else if (number == 3) {
                System.out.println("Check the balance");
                number = scanner.nextInt();
            } else if (number == 4) {
                System.out.println("Check loan balance");
                number = scanner.nextInt();
            } else if (number != 0)
                number = scanner.nextInt();
        }
        while(number != 0);
        System.out.println("Exit");
 */

/*18.4
       Scanner read = new Scanner(System.in);
       int number = read.nextInt();
       //your code goes here
               do {
            if (number % 3 != 0) {
                System.out.println(number);
            }
            --number;
        }while (number >= 0);
        System.out.println("0");
 */

/*20
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		//your code goes here

		int s = amount;
        int p = 10;
        int m = 0;
        int payment = s;
        int d =0;
        int sum = 0;
        for (int x=1; x<=3; x++)
		{
           payment = payment - d;
            d = payment * 10/100;
            m = payment - d;
            sum +=d;
      }
        System.out.println(s - sum);
 */
    }
}
