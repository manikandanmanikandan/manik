package MANI;
import java.util.Scanner;
public class lagesn {
	public static void main(String[] args) {
		
		Scanner	s = new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Share price in thousand");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=1;i<n;i++)
		{
		if(a[0]<a[i])
		{
			a[0]=a[i];
		}
	
		}
		//System.out.println(a[0]);
		int m=a[0]-1;
		System.out.println("Max benefit "+a[0]+"-"+"1"+"="+m+"thousand");
}
}

