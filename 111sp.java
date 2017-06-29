package sop;
import java.util.Scanner;
public class sumofpower {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sum=0;
		int rem,rev=0;
	int n=s.nextInt();
	
	
	while(n!=0)
	{
		int a=n%10;
		int b=n%100;
		int c=b/10;
		sum= (int) (sum+Math.pow(a, c));
		n=n/10;
	}
	System.out.println(sum);

	}
}

