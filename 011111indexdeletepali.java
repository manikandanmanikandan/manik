package guvi;

import java.util.Scanner;

public class indexremove {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int a=s.nextInt();
		StringBuffer sb=new StringBuffer(str);
		sb.deleteCharAt(a);
		String str2=sb.toString();
		String str3=str2;
		StringBuffer sb1=new StringBuffer(str3);
		sb1.reverse();
		if(str2.equalsIgnoreCase(sb1.toString()))
		{
		System.out.println("palindrome");
			}
		else
			{
			System.out.println("Not palindrome");
			}

}
}