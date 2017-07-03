package guvi;

import java.util.Scanner;

public class binary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int base=1, n1=0;
		int n=s.nextInt();
		int a[]=new int[100];
		int b[]=new int[100];
		int c[]=new int[100];
		for(int i=0;i<n;i++)
		{
		a[i]=s.nextInt();
	String s1=Integer.toBinaryString(a[i]);	
	n1=Integer.parseInt(s1);
	b[i]=n1;
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(b[i]); 
		}
for(int i=0;i<n;i++)
{
	int count=0;
	while(b[i]!=0)
	{
		int rem=b[i]%10;
		if(rem==1)
		{
			count++;
		}
	b[i]/=10;
	}
	c[i]=count;
}
for(int i=0;i<n;i++)
{
	for(int j=i+1;j<n;j++)
	{
		if(c[i]<c[j])
		{
		int	temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		temp=c[i];
		c[i]=c[j];
		c[j]=temp;
			
		}
		else if(c[i]==c[j])
		{
			if(a[i]<a[j])
			{
			int	temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			temp=c[i];
			c[i]=c[j];
			c[j]=temp;	
			}	
		}
	}
}
for(int i=0;i<n;i++)
{
	System.out.println(a[i]);
}
}

}
