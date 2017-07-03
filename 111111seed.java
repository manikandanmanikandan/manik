package guvi;

import java.util.Scanner;

public class seed {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		int c=x;
		int d=x;
		while(x!=0)
		{
			int rem=x%10;
			c=c*rem;
			x=x/10;
		}
		System.out.println("Total : "+c);
		if(y==c)
		{
			System.out.println(d+" is a seed of "+y);
		}
		else
		{
			System.out.println(d+" is a not seed of "+y);
		}
	}

}
