package interview;

import java.util.Scanner;

public class RemoveSpace {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		
		System.out.println("String without blanks is :");
	
		for(char i:str.toCharArray()) {
			if(i==' ') {
				continue;
			}
			else {
				
				System.out.print(i);
			}
		}
	}

}