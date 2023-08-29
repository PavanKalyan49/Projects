package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate {
	public static void main(String args[])
	{
		List<Integer> integer = new ArrayList<>();
		integer.add(1);
		integer.add(11);
		integer.add(121);
		integer.add(1331);
		integer.add(1);
		
		System.out.println("Duplicate integers are :");
		
		integer.stream().distinct().forEach(System.out::println);//By using forEach
		
		System.out.println(integer.stream().distinct().collect(Collectors.toList()));//By using Collectors
		
		
	}

}
