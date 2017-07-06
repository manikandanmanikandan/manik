package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class coins {

	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int sum=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=n-1;i>=0;i--)
		{
			count=count+sum/a[i];
			sum=sum%a[i];
		}
		if(sum==0)
		{
			System.out.println(count);
		}
		else
		{
			System.out.println("not possible");
		}
	}

}
