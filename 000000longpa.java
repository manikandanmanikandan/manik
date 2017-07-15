package guvil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class pro62 {

	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<Integer>();
		ArrayList<String> l2=new ArrayList<String>();
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	for(int i=0;i<str.length();i++)
	{
		for(int j=i;j<str.length();j++)
		{
			StringBuffer sb=new StringBuffer(str.substring(i,j));
			sb.reverse();	
			String st=new String(sb);
			if(st.equals(str.substring(i,j)))
			{
			if(st.length()!=1)
			{
			l1.add(st.length());
			l2.add(st);
			}
			}
		}
	}
Collections.sort(l1);
int n=l1.get(l1.size()-1);
for(String x:l2)
{
if(x.length()==n)
{
System.out.println(x);
}
}
	}
	}
		