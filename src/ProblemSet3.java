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
		ps3.fizzString("fig");
		ps3.squirrelPlay(95, false);
		ps3.fizzStringAgain(15);
		ps3.makeBricks(3, 1, 10);
		ps3.loneSum(4, 7, 5);
		ps3.luckySum(11, 6, 5);
		ps3.factorialWithFor(5);
		ps3.factorialWithWhile(3);
		ps3.isPrime(174);
		
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
			if (str.endsWith("b")) 
			{
				System.out.println("FIZZBUZZ");
			}
			else 
			{
				System.out.println("FIZZ");
			}
		}
		else if (str.endsWith("b"))
		{
			System.out.println("BUZZ");
		}
		else 
		{
			System.out.println(str);
		}
	}
		
	public void squirrelPlay(int temp, boolean isSummer) {
		if (isSummer == true)
		{
			if (temp >= 60 && temp <= 100) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		else {
			if (temp >= 60 && temp <= 90) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
	
	public void fizzStringAgain(int n) {
		if (n < 0) {
			System.out.println("INVALID INPUT");
		}
		else {
			
			if (n % 3 == 0 && n % 5 == 0) {
				System.out.println("FIZZBUZZ!");
			}
			else if (n % 3 == 0) {
				System.out.println("FIZZ!");
			}
			else if (n % 5 == 0) {
				System.out.println("BUZZ!");
			}
			else {
				System.out.println(n + "!");
			}
}
	}
	
	public void makeBricks(int small, int big, int goal) {
		if (small < 0 || big < 0 || goal < 0) {
			System.out.println("INVALID INPUT.");
		}
		else {
			int newBig = 0; 
			if (big > (goal / 5)) {
				newBig = (goal / 5);
			}
			else {
				newBig = big; 
			}
			
			goal -= newBig * 5;
			if (goal <= small) {
				System.out.println("YES.");
			} else {
				System.out.println("NO.");
			}			
}
	}
	
	public void loneSum(int a, int b, int c) {
		if (a == b) {
			
			if (b == c) {
				System.out.print(0);
			}
			else {
				System.out.print(c);
			}
		}
		else if (a == c) {
			System.out.print(b);
		}
		else if (b == c) {
			System.out.print(a);
		}
		else {
			System.out.print(a + b + c);
		}
		System.out.println(".");
	}
	
	public void luckySum(int a, int b, int c) {
		int[] input = {a, b, c};
		int sum = 0;
		
		for (int i = 0; i < 3; i++) {
			if (input[i] == 13) break;
			sum += input[i];
		}
		
		System.out.println(sum + ".");
	}
	
	public void factorialWithFor(int n) {
		int test = n;
		for (int i = 1; i < test; i++) {
			n *= i;
		}	
		System.out.println(n); 
	}

	
	public void factorialWithWhile(int n) {
		int test1 = n; 
		int g = 1; 
		while (g < test1) {
			n *= g;
			g++;
		}
		System.out.println(test1 + "! = " + n);
	}
	
	public void isPrime(int n) {
		
		if ((n % 2 == 0 && n != 2)|| (n % 5 == 0 && n !=5) || (n % 3 == 0 && n != 3)) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
	}
	
}
