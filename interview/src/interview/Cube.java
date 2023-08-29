package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cube {
	public static void main(String args[])
	{
		
		List<Integer> integer = new ArrayList<>();
		integer.add(23);
		integer.add(400);
		integer.add(24);
		integer.add(780);
		integer.add(940);
		
		integer.stream().map(i->i=i*i*i).forEach(System.out::println);
		System.out.println(integer.stream().map(i->i=i*i*i).collect(Collectors.toList()));
	}

}
