package guvi;

import java.util.Scanner;

public class dupicate {

	public static void main(String[] args) {
		
	      Scanner s=new Scanner(System.in);
	    String str=s.nextLine();
	      char[] ch=str.toCharArray();
	      for(int i=0;i<str.length();i++)
	      {
	          for(int j=i+1;j<str.length();j++)
	          {
	          if(ch[i]==ch[j])
	          {
	             ch[j]=0; 
	          }      }
	  }
	      String s1="";
	      for(int i=0;i<str.length();i++)
	      { 
	    if(ch[i]!=0)
	      {
	          s1=s1+ch[i];
	       }
	      }     
	  System.out.print(s1);
	}

}
