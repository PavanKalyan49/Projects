package interview;

import java.util.ArrayList;
import java.util.List;


public class Filter_UpperCase {
	public static void main(String args[]) {
		List<String> str = new ArrayList<>();
		str.add("Srikakulam");
		str.add("Andhra Pradesh");
		str.add("Bengaluru");
		str.add("Karnataka");
		str.add("Sai");
		
		str.stream().filter(i->i.length()<5).map(i->i.toUpperCase()).forEach(System.out::println);

}
}
