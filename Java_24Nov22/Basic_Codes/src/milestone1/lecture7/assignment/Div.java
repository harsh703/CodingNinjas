package milestone1.lecture7.assignment;

import java.util.Scanner;

public class Div {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int j =1;

		for( int i = 1; i <= N ; j++){
			if ((3*j + 2) % 4 != 0){
				System.out.print((3*j + 2) + " ");
				i++;
			}
		}

	}

}
