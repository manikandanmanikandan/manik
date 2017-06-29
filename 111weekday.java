package logic;

import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String str=s.next();
		if( str.equalsIgnoreCase("Saturday")|| str.equalsIgnoreCase("sunday"))
		{
			System.out.println("false");
		}
		else
		{
			System.out.println("true");
		}
		
	
	}

}
