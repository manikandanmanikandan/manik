package guvil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class rotate {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<Integer>();
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			a.add(s.nextInt());
			System.out.println(" "+a);
			int m = s.nextInt();
			Collections.rotate(a,m);
		System.out.println("rotated "+a);
		}
		
		
	}

}