package guvi;


import java.util.Scanner;

public class childrencandy {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[5];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			if(a[i]>a[j])
			{
				int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
		}
	int count=n;
	int sum=1;
	for(int i=0;i<n-1;i++)
	{
		if(a[i]<a[i+1])
		{
			count=count+sum++;
		}
	}
	System.out.println("chocolates : "+count);
	}

}
