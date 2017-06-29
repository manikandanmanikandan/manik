package logic;

import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		int sum=0,reverse=0;
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		
				while(i!=0)
				{
			int temp=i;
				while(temp!=0)
				{
				int rem=temp%10;
				sum = sum+rem;
				temp=temp/10;
				}
			i=i/10;
				
				}
				System.out.println(sum);
				
			
		
	}

}
