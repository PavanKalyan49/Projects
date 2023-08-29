package interview;

import java.util.ArrayList;
import java.util.List;

public class TotalNumberofElements {

	public static void main(String args[])
	{
		List<String> Str = new ArrayList<>();
		Str.add("Srikakulam");
		Str.add("Bengaluru");
		Str.add("Hyderabad");
		Str.add("Madras");
		Str.add("Visakhapatnam");
		Str.add("Mangaluru");
		
		System.out.println(Str.stream().count());
	
	}
}
