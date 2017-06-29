package div;
import java.util.Scanner;
public class no {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sum=0;
		int i=0;
	int a=s.nextInt();
int b=s.nextInt();
while(a>=b)
{
	a=a-b;
	i++;
}
System.out.println(i);
	}
}

