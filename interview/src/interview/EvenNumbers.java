package interview;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {
	public static void main(String args[])
	{
		List<Integer> integer= new ArrayList<>();
		integer.add(12);
		integer.add(22);
		integer.add(31);
		integer.add(40);
		integer.add(9);
		
		System.out.println("Even numbers in the list are :");
		integer.stream().filter(val->val%2==0).forEach(System.out::println);
		
							
	}

}
