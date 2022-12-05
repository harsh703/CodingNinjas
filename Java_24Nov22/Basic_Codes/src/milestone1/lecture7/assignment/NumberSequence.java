package milestone1.lecture7.assignment;

import java.util.Scanner;

public class NumberSequence {

	public static void main(String[] args) {

	    Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n==0) {
			System.out.print("false");
			return;
		}
		
		int pre = s.nextInt();
		int i = 1;
		boolean isDec = true;
		int flag = 0;
		if(n<=0||n==1) {
			flag=1;
		}
		while(i<n) {
			int current = s.nextInt();
			if(pre == current) {
				flag=1;
			}else if(pre>current) {
				if(isDec) {
					pre = current;
				}else {
					flag=1;
				}
			}else if(pre<current) {
				isDec = false;
				pre = current;
			}
			i++;
		}
		if(flag==0) {
			System.out.print("true");
		}else {
			System.out.print("false");
		}

	}

}
