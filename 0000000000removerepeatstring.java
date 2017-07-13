package guvi;

import java.util.Scanner;

public class removetherepeatstring {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		int count=0,i,j;
		for( i=0;i<st.length();i++)
		{ count=0;
			for( j=0;j<st.length();j++)
			{
			if(st.charAt(i)== st.charAt(j))	
			{
				count++;
			}
			}
			if(count==1)
			{
				System.out.print(st.charAt(i)); 
			}
		}
	}
}