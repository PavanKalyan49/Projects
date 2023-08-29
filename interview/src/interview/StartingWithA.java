package interview;

import java.util.ArrayList;
import java.util.List;

public class StartingWithA {
	public static void main(String args[]) {
		List<String> str = new ArrayList<>();
		str.add("Andhra");
		str.add("Telangana");
		str.add("Karnataka");
		str.add("Tamil Nadu");
		str.add("Kerala");
		
		str.stream().filter(i->i.startsWith("A")).forEach(System.out::println);
		
		
		
	}

}
