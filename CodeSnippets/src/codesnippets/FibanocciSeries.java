package codesnippets;

import java.util.Scanner;

public class FibanocciSeries
{
public static void main(String args[])
{
	int a=0,b=1;
	int c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter length");
	int l=sc.nextInt();
	if (l==0)
	{
		System.out.println(a);
	}
	else if(l==1)
	{
		System.out.println(a+" "+b);
	}
	else
	{
		
		System.out.print(0+" "+1);
		for(int i=0;i<l-2;i++)
		{
			
	          c=a+b;
	          System.out.print(" "+c);
	            a=b;
	            b=c;
		}
	
	}
}	
}

