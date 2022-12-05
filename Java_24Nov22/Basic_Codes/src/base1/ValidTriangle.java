package base1;

import java.util.*;
public class ValidTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter all three sides of triangle");
		int side1,side2,side3;
		side1 = s.nextInt();
		side2 = s.nextInt();
		side3 = s.nextInt();
		
		if(side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1)
			System.out.println("it is not a valid triangle");
		else
			System.out.println("It is a valid triangle");
	}

}
