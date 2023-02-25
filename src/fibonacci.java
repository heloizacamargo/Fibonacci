import java.util.*;

public class fibonacci {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter element position to find Fibonacci number: ");		
		String sn = scanner.nextLine();				
		int n = Integer.parseInt(sn);
		
		long startTime1 = System.nanoTime();
		System.out.println("Fibonacci number: " + recursion(n));
		long endTime1 = System.nanoTime();
		long totalTime1 = endTime1 - startTime1;
		System.out.println("Recursion total time: " + totalTime1);
		
		long startTime2 = System.nanoTime();
		System.out.println("Fibonacci number: " + iteration(n));
		long endTime2 = System.nanoTime();
		long totalTime2 = endTime2 - startTime2;
		System.out.println("Iteration total time: " + totalTime2);
		
		scanner.close();
	}
	
	public static long recursion(int n) {
		
		if (n == 0) {
			return 0;
		}
		
		else if (n == 1) {
			return 1;
		}
		
		else {
			return recursion(n - 1) + recursion(n - 2);
		}				
	}
	
	public static long iteration(int n) {
		
		int previouspreviousNumber, previousNumber = 0, currentNumber = 1;
		
		if (n == 0) {
			return 0;
		}
		
		else if (n == 1) {
			return 1;
		}
		
		else {
	        for (int i = 1; i < n ; i++) {
	            previouspreviousNumber = previousNumber;
	            previousNumber = currentNumber;
	            currentNumber = previouspreviousNumber + previousNumber;	            
	        }
	        return currentNumber;
		}
	}
}