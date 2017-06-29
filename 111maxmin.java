package logic;

import java.util.Arrays;
import java.util.Scanner;
public class maxmin{

	public static void main(String[] args) {
		int i;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}	}
		int b=(n/2)+1;
		if(n%2==1)
		{
			System.out.println(a[0]);
		for(i=1;i<=n/2;i++)
		{
		System.out.println(a[a.length-i]);
		System.out.println(a[i]);
		}
		}
		else
		{
			System.out.println(a[0]);
			for(i=1;i<b-1;i++)
			{
				System.out.println(a[a.length-i]);
			System.out.println(a[i]);
		}
			System.out.println(a[a.length-i]);
		}			
		
}
	}