package guvi;

import java.util.Scanner;

public class subset {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1=s.next();
		int a=s.nextInt();
		for(int i=0;i<s1.length();i++)
		{
		for(int j=i+1;j<s1.length();j++)
		{
		System.out.print(s1.substring(i, a-1));
		System.out.println(s1.charAt(j));
		}
		break;
		}		
	}

}
