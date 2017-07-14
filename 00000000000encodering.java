package guvil;

import java.io.IOException;
import java.util.Scanner;

public class twoencoderpro61 {

	
		public static void main(String args[])throws IOException
		{
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		String c="",d="";
				char m;
				int v=1;
				int i=0,j=0;
				for(i=0;i<a.length();i++)
		        {
					m=a.charAt(i);
					if(m>='a'&&m<='p')
		            {
					c+=(char)(m+10);
				}
		    else
		    {
			if(m>='r'&&m<='z')
		      {
				v=0;
				while((122-m+v)!=10)
		        {
				v++;
						}
						 c+=(char)(v+97);					 
					}	}}
		  for(i=1;i<a.length()-1;i++)
		  {
		m=b.charAt(i);
		if(m>='a'&&m<='r')
		    {
				d+=(char)(m+10);
			}
		  else
		  {
		if(m>='s'&&m<='z')
		    {
			v=0;
			while((122-m+v)!=9)
		      {
			v++;
					}
		d+=(char)(v+97);					 
				}	}}
				System.out.println(c+" "+b.charAt(0	)+d+b.charAt(b.length()-1));
}}
