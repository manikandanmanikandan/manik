package logic;
import java.util.Scanner;
public class powerofdigit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=0,sum=0;
		int n=s.nextInt();
		int temp=n;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		
		
			while(temp!=0)
			{
				int k=1;
				int rem=temp%10;
				for(int i=0;i<count;i++)
				{
					k=k*rem;
				}
				sum=sum+k;
				temp=temp/10;
				
			}
			System.out.println(sum);
		
	
	}
}

