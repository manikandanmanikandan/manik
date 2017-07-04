package guvi;


import java.util.Scanner;

public class delectnumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int a[]=new int[n];
		int count=0;
		int i=0;
		while(n!=0)
		{
			int rem=n%10;
			a[i]=rem;
			n/=10;
			i++;
			count++;
			
		}
		for(i=0;i<count;i++)
		{
			for(int j=i+1;j<count;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}	
		for(i=0;i<count-k;i++)
		{
			System.out.print(a[i]);
		}
	}

}
