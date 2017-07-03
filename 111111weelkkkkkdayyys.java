package logic;

import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		String str=input.next();
		if( str.equal("saturday")||(str.equal("sunday")||str.equalsIgnoreCase("Saturday")|| str.equalsIgnoreCase("sunday"))
		{
			System.out.println("false");
		}
		else
		{
			System.out.println("true");
		}
		
	
	}

}
