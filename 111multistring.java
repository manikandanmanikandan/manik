package guvi;

import java.util.Scanner;

public class stingmulplication {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		int c=a*b;
		String d=Integer.toString(c);
		System.out.println(d);
	}

}
