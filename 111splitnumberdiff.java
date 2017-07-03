package guvi;

import java.util.Scanner;

public class diffsum {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a,b,c;
	if(n%10==0)
	{
		a=n/2;
		b=n-a;
		System.out.println(b+" "+a);
		c=b-a;
		System.out.println(c);
	}
	else
	{
		a=n/2;
		b=n-a;
		System.out.println(b+" "+a);
		c=b-a;
		System.out.println(c);	
	}
}
}