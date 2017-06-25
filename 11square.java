package test;

import java.util.Scanner;

public class square {
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		int m=8;
		int a[]=new int[m];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int s1=Math.abs(a[0]-a[4]);
		int s2=Math.abs(a[2]-a[6]);
		int s3=Math.abs(a[1]-a[3]);
		int s4=Math.abs(a[5]-a[7]);
		if(s1==s2 && s1==s3 && s1==s4)
		{
			System.out.println("square");
		}
		else
		{
			System.out.println("Not square");
		}
	}

}
