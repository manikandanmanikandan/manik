package MANI;
import java.util.Scanner;
public class sumnpalidrome {

	public static void main(String[] args) {
	int sum=0,rev=0;
	Scanner	s = new Scanner(System.in);
	int a=s.nextInt();
	int t;
	t=a;
	while(t!=0)
	{
		int rem=t%10;
		 sum=rem+sum;
		 t=t/10;
	}
		System.out.println("sum"+sum);
		int m=sum;
		while(sum!=0)
		{
			int re=sum%10;
			rev=rev*10+re;
			sum=sum/10;
		}
		if(rev==m)
		{
			System.out.println("palidrome");
		}
		else
		{
			System.out.println("no palidrome");
		}
	}

}
