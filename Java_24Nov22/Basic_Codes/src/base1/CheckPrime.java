package base1;

import java.util.*;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int number,counter=2;
		number = s.nextInt();
		while(number%counter !=0 && counter <= (number/2) ) {
			counter++;
		}
		if(number%counter != 0)System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
	}

}
