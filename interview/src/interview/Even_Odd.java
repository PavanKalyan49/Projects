package interview;

import java.util.ArrayList;
import java.util.List;

public class Even_Odd {
	public static void main(String args[]) {
		List<Integer> integer = new ArrayList<>();
		integer.add(12);
		integer.add(22);
		integer.add(33);
		integer.add(44);
		integer.add(31);
		integer.add(170);
		System.out.println("Even numbers in the ArrayList are :");
		integer.stream().filter(i->i%2==0).forEach(System.out::println);
		System.out.println("Odd numbers in the ArrayList are :");
		integer.stream().filter(i->i%2!=0).forEach(System.out::println);
	}

}
