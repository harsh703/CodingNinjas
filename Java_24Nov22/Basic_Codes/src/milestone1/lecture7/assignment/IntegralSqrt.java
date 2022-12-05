package milestone1.lecture7.assignment;
import java.util.Scanner;

public class IntegralSqrt {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i;
		if(n<2) {System.out.print(n);return;}
		for(i = 0; i*i <= n ;i++);
		i--;
		System.out.print(i);

	}

}
