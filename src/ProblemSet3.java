/**
 * INSTRUCTIONS.
 * 
 * Problem Set 3 will be more extensive than the first two. You've been warned. Practice makes perfect,
 * and we'll get a lot of practice with conditional and iterative control structures.
 * 
 * A few new concepts are being introduced with this assignment. Last time, we saw methods (other than
 * the @main method) for the first time. Now, we're seeing parameters, which are the variables inside
 * the parentheses in our methods. We'll cover these in more detail later. For now, you just need to
 * understand the basics.
 * 
 * A parameter is data that is provided to the method. It helps the method do its job. It's passed in
 * through the parentheses, and you can reference these variables by name as if they're your own.
 */
import java.util.Scanner;
public class ProblemSet3 {
	
	/**
	 * Make sure you're testing your code by calling your methods from the main method!
	 */
	
	public static void main(String[] args) {
		ProblemSet3 ps3 = new ProblemSet3();		
			
		ps3.dateFashion(0, 0);
		ps3.fizzString(null);
		ps3.squirrelPlay(0, false);
		ps3.fizzStringAgain(0);
		ps3.makeBricks(0, 0, 0);
		ps3.loneSum(0, 0, 0);
		ps3.luckySum(0, 0, 0);
		ps3.factorialWithFor(0);
		ps3.factorialWithWhile(0);
		ps3.isPrime(0);
		
	}
		
	public void dateFashion(int you, int date) {
		
		Scanner scanner = new Scanner( System.in );
		System.out.println("Let me see if I can get you a table, but first...");
		System.out.println("What is your stylishness?");
			you = scanner.nextInt();
		System.out.println("What is your date's stylishness?");	
			date = scanner.nextInt();
		if (you <= 2 || date <= 2)
		{
			System.out.println("NO");
			
		}
		else if (you >= 8 || date >= 8)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("MAYBE");
		}
		scanner.close();
	}
	
	public void fizzString(String str) {
		if (str.contains("f"))
		{
			
		}
		else if (str = "dib")
		{
			
		}
		else if (str = "fib")
		{
			
		}
		else 
		{
			System.out.println(str);
		}
	}
		
	public void squirrelPlay(int temp, boolean isSummer) {
		
	}
	
	public void fizzStringAgain(int n) {
		
	}
	
	public void makeBricks(int small, int big, int goal) {
		
	}
	
	public void loneSum(int a, int b, int c) {
		
	}
	
	public void luckySum(int a, int b, int c) {
		
	}
	
	public void factorialWithFor(int n) {
		
	}
	
	public void factorialWithWhile(int n) {
		
	}
	
	public void isPrime(int n) {
		
	}
	
}
