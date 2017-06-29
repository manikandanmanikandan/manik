package logic;

import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(); 
		for(int i=0;i<n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int m=0;m<=i;m++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}


