package milestone1.lecture7.assignment;
import java.util.*;

public class AllPrime {
	public static boolean isPrime(int number) {
		
		if(number == 2 || number == 3)
			return true;
		if(number % 2 == 0 || number % 3 == 0)
			return false;
		
		for(int i = 5;i * i < number; i += 6) {
			if(number % i == 0 || number % (i+2) == 0)
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=2;i<=n;i++) {
			if(isPrime(i))
				System.out.print(i + " ");
		}
	}

}
