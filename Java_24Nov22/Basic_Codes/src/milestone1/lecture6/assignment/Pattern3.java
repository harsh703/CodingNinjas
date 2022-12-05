package milestone1.lecture6.assignment;
import java.util.*;

//   *
//  ***
// *****
//*******

public class Pattern3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		for(int i = 1 ; i<= N ; i++){
			int j = 1;
			while(j <= N -i ){
				System.out.print(' ');
				j++;
			}
			int no = 1;
			while(no <= 2*(i-1) + 1){
				System.out.print('*');
				no++;
			}
			System.out.println();

		}

	}

}
