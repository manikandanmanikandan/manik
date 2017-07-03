package guvi;

import java.util.Scanner;

public class reserveoddindex {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
		String str1[]=str.split(" ");
	int 	b=str1.length;
	for(int i=0;i<b;i++)
	{
		if(i%2==1)
		{
			
			System.out.print(str1[i]);
		}
		else
		{
			StringBuffer sb=new StringBuffer(str1[i]);
			System.out.print(" "+sb.reverse()+" ");
			
		}
	}
	}

}
