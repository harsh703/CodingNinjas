package base1;

import java.util.*;

public class Zoo_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter word :");
		Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        int length = word.length();
        int no_of_z=0,no_of_o=0;
        for(int i = 0; i<length;i++){
            if(word.charAt(i) == 'z')no_of_z++;
            if(word.charAt(i) == 'o')no_of_o++;
        }
        //System.out.println(no_of_z+" "+no_of_o);
        if(no_of_z * 2 == no_of_o){System.out.print("Yes");}else{System.out.print("No");}
	}

}
