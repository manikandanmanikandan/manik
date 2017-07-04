package guvi;

import java.util.Scanner;

public class firstrepl {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=0;
		int n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
	for(int j=i+1;j<n;j++)
	{
		if(a[i]==a[j])
		{
			b[i]=a[i];
		}
	}
}
for(int i=0,j=0;i<n;i++)
{
	if(b[i]!=0)
	{
		c[j]=b[i];
		j++;
		
	}
}
System.out.println(c[0]);
	}

}
