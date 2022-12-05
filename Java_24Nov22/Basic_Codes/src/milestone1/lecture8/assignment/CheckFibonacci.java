package milestone1.lecture8.assignment;

import java.util.Scanner;

public class CheckFibonacci {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long sq1 = (long) (5* Math.pow(n, 2) + 4);
		long sq2 = (long) (5* Math.pow(n, 2) - 4);
		
		double sqrt1 = Math.sqrt(sq1);
		double sqrt2 = Math.sqrt(sq2);
		
		//return sqrt1 * sqrt1 == sq1 || sqrt2 * sqrt2 == sq2;
		
		System.out.println(sqrt1 * sqrt1 == sq1 || sqrt2 * sqrt2 == sq2);
	}

}
