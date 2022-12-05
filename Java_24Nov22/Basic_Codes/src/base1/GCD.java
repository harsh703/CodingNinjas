package base1;
import java.util.*;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int number1,number2;
		number1 = s.nextInt();
		number2 = s.nextInt();
		
		while(number1!=0 && number2 !=0) {
			if(number1 > number2)number1 = number1 - number2;
			else
				number2 = number2 - number1;
		}
		int GCD_number = number1==0?number2:number1;
		System.out.println("GSD of given number is " + GCD_number);
	}

}
