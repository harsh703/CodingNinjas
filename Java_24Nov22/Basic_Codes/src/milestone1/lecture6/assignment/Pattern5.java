package milestone1.lecture6.assignment;
import java.util.*;

public class Pattern5 {

	
	public static void main(String args[]) 
    {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();

		for( int i = 1; i<= N; i++){
			int j = 1;
			int rev = 2*i -1;
			while(j<=N+1-i){
				System.out.print(rev);
				rev +=2;
				j++;
			}
			rev = 1;
			while(j<=N){
				System.out.print(rev);
				rev+=2;
				j++;
			}
			System.out.println();
		}
    }



}
