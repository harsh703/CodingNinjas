package base1;
import java.util.*;

public class SampleInputOutput {

	public static void main(String[] args) {
		char name;
		int m1, m2, m3;
		Scanner s = new Scanner(System.in);
		name = s.next().charAt(0);
		m1 = s.nextInt();
		m2 = s.nextInt();
		m3 = s.nextInt();
		System.out.println(name);
		System.out.println((m1 + m2 + m3)/3);

	}

}
