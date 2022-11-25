package base1;
import java.util.*;

public class PosOrNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number1 = s.nextInt();
		
		if(number1 == 0)System.out.println("number is 0");
		else if(number1 > 0)System.out.println(number1 + " is positive");
		else System.out.println(number1 + " is negative");

	}

}
