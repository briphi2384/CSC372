import java.util.Scanner;
public class ctaMod5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		int[] array = new int[5];
		
		
		//gather input from user
		for (int i =0; i < 5; i++) {
			System.out.print("Enter number " + (i+1) + ": ");
			array[i] = input.nextInt();
			
		}
		
		//call recursive method to calculate sum of ints in array
		int sum = Recursion(array,0);
		System.out.println("Sum of numbers inputted: " + sum);

	}//end of main
	
	public static int Recursion (int[] array, int n) {
		
		
		//Base case
		if (n == array.length) {
			return 0;
			
			
			//return current number, call method again, add numbers
		}else {
			return array[n] + Recursion(array, n+1);
		}
	
	}

}//end of class


