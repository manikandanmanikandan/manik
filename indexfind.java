package guvi;

import java.util.Scanner;

public class stringoccur {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s.nextLine();
		int w=-1;
		int a=s1.length();
		int b=s2.length();
		int length=a-b;
		for(int i=0;i<length;i++)
		{
			if(s1.substring(i,i+s2.length()).equals(s2))
			{
				w=i;
				break;
			}
		}
		System.out.println(w);
	}

}