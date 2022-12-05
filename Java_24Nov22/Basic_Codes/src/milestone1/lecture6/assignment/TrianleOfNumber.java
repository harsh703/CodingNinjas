package milestone1.lecture6.assignment;
import java.util.*;
/*
   1
  232
 34543
4567654
*/
public class TrianleOfNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		for(int i = 1 ; i<= N ; i++){
			int j = 1;
			while(j <= N -i ){
				System.out.print(' ');
				j++;
			}
			while(j <= N) {
				System.out.print(i+j-(N-i)-1);
				j++;
			}
			int rev = 2*(i-1);
			while(j <= N + i -1) {
				System.out.print(rev);
				j++;
				rev--;
			}
			System.out.println();

		}

	}

}
