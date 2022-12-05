package milestone1.lecture7.assignment;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int decimal = s.nextInt();
		long binary = 0, multiplier = 1;
		
		while(decimal > 0) {
			binary += (decimal% 2)*multiplier;
			decimal /= 2;
			multiplier *= 10;
		}
		System.out.println(binary);
	}

}
