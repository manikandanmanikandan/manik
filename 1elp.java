package test;

import java.util.Scanner;

public class elep {
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int a[]=new int[m];
		int w=s.nextInt();
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		int sum=0,count=0;
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			
			if(sum<=w)
			{
				sum=a[i]+sum;
				
			if(sum<=w)
			{
				
			
			count++;
			
			}
			}
		}
		System.out.println(count);
		
		
	}

}
