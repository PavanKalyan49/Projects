package interview;

import java.util.ArrayList;
import java.util.List;

public class Exam {
	public static void main(String args[]) {
		List<Integer> list= new ArrayList<>();
		list.add(12);
		list.add(34);
		list.add(23);
		list.add(14);
		list.add(35);
		list.add(34);
		System.out.println("Even");
		list.stream().filter(i->i%2==0).forEach(System.out::println);
		System.out.println("Odd");
		list.stream().filter(i->i%2!=0).forEach(System.out::println);
		
	}

}
