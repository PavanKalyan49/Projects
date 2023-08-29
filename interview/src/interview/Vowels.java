package interview;

import java.util.Scanner;

public class Vowels {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		int count=0;
		for(char i:str.toCharArray()) {
			if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u'||i=='A'||i=='E'||i=='I'||i=='O'||i=='U') {
				System.out.println("Vowels are there");
				count++;
				break;
				}
			
		}
		if(count==0)
		{
			System.out.println("Vowels are not there");
		}
			
		}
	}



