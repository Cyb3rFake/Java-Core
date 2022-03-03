package Arrays;

public class All_practice_commented {
    public static void main(String args){
/*21.2
       String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

       for (int i = 0; i < 7; i++) {
           System.out.println(days[i]);
       }
 */

/*22.2
Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array =  new int[length];
        int sum = 0;
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] % 4 == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
 */

/*23.2
       Scanner scanner = new Scanner(System.in);
       int length = scanner.nextInt();
       int[] sides =  new int[length];
       for (int i = 0; i < length; i++) {
           sides[i] = scanner.nextInt();
           System.out.println(sides[i]*sides[i]);
       }
 */

/*24.2
       int[][] matrix = {
               {8, 1, 6},
               {3, 5, 7},
               {4, 9, 0},
       };
       //output the numbers
        for (int i = 0; i < 3; i++){
            for (int j = 0; j<3; j++){
                System.out.println(matrix[i][j]);
            }
            System.out.println();
        }
 */

/*26.0
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();

		//your code goes here
		        for (int i = arr.length -1; i>=0; i--){
            System.out.print(arr[i]);
        }
	}
}
 */
    }
}
