package guvil;

import java.util.Scanner;

public class hunter114 {

	public static void main(String[] args) {
		int n1,n2,sum=0;
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    n1=s.nextInt();
	    n2=s.nextInt();
	    int ar[]=new int[n];
	    int i=0,j=0,k=0;
	    for(i=n1;i<=n2;i++)
	    {
	    	j=n1;
	    	while(j<i)
	        {
	        if(i%j==0)
	        {
	          break;
	        }
	        j++;
	        }
	        if(i==j)
	        {
	          ar[k]=i;
	          k++;
	        }
	        }
	          for(i=0;i<ar.length;i++){
	            int c1=0;
	            for(j=i;j<ar.length;j++){
	              c1++;
	              sum=sum+ar[j];
	              if(sum==n){
	                System.out.println(""+c1);
	                break;
	              }
	              
	            }
	          }
	}

}
