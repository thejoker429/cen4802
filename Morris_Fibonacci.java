package morris_fibonacci;

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
	