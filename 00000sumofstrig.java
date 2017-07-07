package guvi;

import java.util.Scanner;

public class stringcorre {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		byte ch[]=s1.getBytes();
		int sum=0,sum1=0;
		for(int i=0;i<ch.length-1;i++)
		{
			sum=sum+(ch[i+1]-ch[i]);
		}
		sum1=sum-ch[0];
		int sum2;
		sum2=Math.abs(sum1);
		
		System.out.println((char)sum2); 
		
	}

}
