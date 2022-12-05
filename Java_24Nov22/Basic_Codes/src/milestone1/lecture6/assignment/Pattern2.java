package milestone1.lecture6.assignment;
import java.util.*;


public class Pattern2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		for(int i = 1 ; i<= N ; i++) {
			int j = 1;
			while(j <= N - i + 1) {
				System.out.print((N - i + 1));
				j++;
			}
			System.out.println();
		}

	}

}
