package test;

import java.util.Scanner;

public class choc {
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("input");
			int a=s.nextInt();
			int b=s.nextInt();
			System.out.println("output");
			System.out.println((a*b)-1);
		}
		
	}

}
