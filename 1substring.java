import java.util.Scanner;

public class choc {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first string");
        String a=s.nextLine();
        System.out.println("Enter the second string");
        String b=s.nextLine();
        int c=0;
        System.out.print("Output is");
        if(a.length()>=2 && b.length()>=2)
        {
        for(int i=0;i<=a.length()-2;i++)
        {
        	String a1=a.substring(i,i+2);
        	if(b.contains(a1))
        	{
        		System.out.println("True");
        		c=1;
        		break;
        	}
       
        }}
        if(c==0)
        {
        	System.out.println("False");
        
        }
		
		
	}

}