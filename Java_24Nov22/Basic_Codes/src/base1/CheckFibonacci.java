package base1;
import java.util.*;

public class CheckFibonacci {
	
	static boolean isPerfectSquare(int x) {
		int square_root = (int)Math.sqrt(x);
		return x == square_root*square_root;
	}
	
	static boolean isFibonacci(int n) {
		return isPerfectSquare(5*n*n + 4) ||
				isPerfectSquare(5*n*n - 4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int number;
		number = s.nextInt();
		System.out.println(isFibonacci(number)? "yes":"no");
		
	}

}
