package milestone1.lecture8.assignment;

import java.util.Scanner;

public class ToCelci {
	public static int toC(int F){
		return (5*(F-32))/9;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int E = sc.nextInt();
		int W = sc.nextInt();

		for(int i = S; i<= E; i+= W){
			System.out.println(i + " "+ (5*(i-32))/9);
		}
	}
}
