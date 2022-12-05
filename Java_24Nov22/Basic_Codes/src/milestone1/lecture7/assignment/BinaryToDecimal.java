package milestone1.lecture7.assignment;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int binary = s.nextInt();
		int sum = 0;
		
		int multiplier = 1;
		while(binary > 0) {
			sum += (binary %10)*multiplier;
			multiplier *= 2;
			binary /= 10;
		}
		System.out.println(sum);
	}

}
