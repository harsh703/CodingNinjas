package milestone1.lecture4.assignment;

import java.util.Scanner;

public class IsUpperCase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);
        int asciiValue = ch;
        if(asciiValue <= 123 && asciiValue >= 97){
            System.out.print("0");
        }else if(asciiValue <= 92 && asciiValue >= 65){
            System.out.print("1");
        }else{
            System.out.print("-1");
        }

	}

}
