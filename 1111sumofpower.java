package logic;
import java.util.Scanner;
public class sumofpower {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int sum=0;
	int rem,rev=0;
int n=s.nextInt();
while(n!=0)
{
	rem=n%10;
	rev=rev*10+rem;
	n=n/10;
}
System.out.println(rev);
while(rev!=0)
{
	int a=rev%10;
	int b=rev%100;
	int c=b/10;
	sum= (int) (sum+Math.pow(a, c));
	rev=rev/10;
}
System.out.println(sum);
}
}