package morris_fibonacci;
/**
*@author Chris Morris:
*@version 1.0
* Returns the nth number of the fibonacci sequence, and only that number.
* The main method references the static method which calculates the equation for the fibonacci sequence using a recursive method.
*
* @param  n the number that is given to compute the nth number in the fibonacci sequence, necessary to calculate the fibonacci sequence to that number
* @return   the number, if n given is less than or equal to 1 
*
*/

public class Morris_Fibonacci {
		
	public static int fibonacci (int n) {
				
		if (n <= 1) { 
			return n; 
		}
		
		return fibonacci(n - 1) + fibonacci(n - 2); 
	}
			
	public static void main(String[] args) {

		int n = 10;
		
		System.out.print("The " + n + "th term in the fibonacci sequence is: " + fibonacci(n));
	
	}
	
}
	