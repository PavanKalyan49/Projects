package interview;

import java.util.ArrayList;
import java.util.List;

public class Startingwith1 {
	public static void main(String args[])
	{
		List<Integer> integer = new ArrayList<>();
		integer.add(19);
		integer.add(15);
		integer.add(20);
		integer.add(25);
		integer.add(11);
		

		System.out.println("Numbers starting with 1 are :");
		integer.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
	}

}
