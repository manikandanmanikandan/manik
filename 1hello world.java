package mani;

import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String s1="";
		String s2[]=str.split(" ");
		for(int i=s2.length-1;i>=0;i--)
		{
			s1+=s2[i]+" ";
		}
System.out.println(s1+" ");
	}

}
