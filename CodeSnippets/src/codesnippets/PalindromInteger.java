package codesnippets;

import java.util.Scanner;

public class PalindromInteger {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		 int num=sc.nextInt();
		 int temp=num;
		 int sum=0;
		 while(num>0)
		 {
		 int r=num%10;//Last digit
		 
		 sum=sum*10+r;
		 num=num/10;
		 }
		 if(sum==temp)
		 {
			 System.out.println("Palindrome");
		 }
		 else
		 {
			 System.out.println("Not a Palindrome");
		 }
	}

}
