package milestone1.lecture6.assignment;

import java.util.Scanner;

public class StartNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        System.out.println('*');

        for(int i = 1; i<= N; i++){
            System.out.print('*');
            int j = 1;
            while(j <= i){
                System.out.print(j);
                j++;
            }
            int rev = i-1;
            while( rev > 0){
                System.out.print(rev);
                rev--;
            }
            System.out.println('*');
        }
        for(int i = 1; i< N;i++){
            System.out.print('*');
            int j = 1;
            while(j <= N-i ){
                System.out.print(j);
                j++;
            }
            int rev = N-1-i;
            while( rev > 0){
                System.out.print(rev);
                rev--;
            }
            System.out.println('*');
        }

        System.out.println('*');

	}

}
