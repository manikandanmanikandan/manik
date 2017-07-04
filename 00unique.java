package guvi;

import java.util.Scanner;

public class uniquenumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int flag,x = 0;
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
	flag=0;
			for(int j=0;j<n;j++)
			{
				if(a[i]==a[j] && i!=j)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				 x=a[i];
			}
			
		}
		System.out.println(x);
	}

}
