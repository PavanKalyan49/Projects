package codesnippets;

import java.util.Scanner;

public class Prime {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int count = 0;
		
		if(num==0 || num==1)
		{
			System.out.println("Number is neither nor composite");

		}
		
		else
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
				if(count>2)
				{
					System.out.println("Number is  composite");
				}
				else
				{
					System.out.println("Number is  prime");
				}		
			
		}
	}

}
