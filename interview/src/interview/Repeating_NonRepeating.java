package interview;

import java.util.Scanner;

public class Repeating_NonRepeating {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		
		
		for(char i:str.toCharArray())
		{
			if(str.indexOf(i)==str.lastIndexOf(i))
			{
				System.out.println("First non repeating character is:"+ i);

				break;
			}
			
			
		}
		for(char i:str.toCharArray())
		{
		
		if(str.indexOf(i)!=str.lastIndexOf(i))
		{
			System.out.println("First repeating character is:"+ i);
			break;
			
		}
		}
		
		
	
		
		
	}

}
