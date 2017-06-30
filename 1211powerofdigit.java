package guvi;

import java.util.Scanner;

public class logicc {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); 
		int rev=0,i=0,count=0;
		int n=s.nextInt();
		int a[]=new int[100];
		int b[]=new int[100];
		int c[]=new int[100];
		int d[]=new int[100];
	
		while(n!=0)
		{
		int r=n%10;
		rev=rev*10+r;
		n=n/10;
		}
		int temp=rev;	
		while(rev!=0)
		{
		int r=rev%10;
			a[i]=r;
			rev=rev/10;
			i++;
			count++;
		}	
		i=0;
		while(temp!=0)
		{
			int z=temp%100;
			int x=z/10;
			b[i]=x;
			temp/=10;
			i++;
		}
		int sum=0;
		b[count-1]=a[0];
		for(i=0;i<count;i++)
		{
			int w;
	  	    int	result=1;
			 w=a[i];
		while(b[i]!=0)
			{
				result=result*w;
				b[i]--;
			}
			sum=sum+result;		
		}
		System.out.println(sum);
	
}
}