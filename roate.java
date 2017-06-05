package MANI;

import java.util.Scanner;

public class BitWise {
private static Scanner s;

public static void main(String args[])
{
	s = new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	
	
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
		
	}
	int d=s.nextInt();
	for(int i=0;i<n;i++)
	{
		if(a[i]>d)
		{
			System.out.println(a[i]);
		}
	}
	for(int i=0;i<n;i++)
	{
		if(a[i]<=d)
		{
			System.out.println(a[i]);
		}
	
	}

	}