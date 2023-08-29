package assignment4;

import java.util.ArrayList;
import java.util.Collections;

class Sort implements Comparable<Sort>
{
	private String name;
	private int age;
	private double grade;
	
	public int compareTo(Sort s)
	{
		return Integer.valueOf( s.age-this.age);
		
	}
	
	public Sort(String nm,int ag,double g)
	{
		this.name=nm;
		this.age=ag;
		this.grade=g;
	}
		
		public String getname()
		{
			return name;
		}
		
		public int getage()
		{
			return age;
		}
		
		public double getgrade()
		{
			return grade;
		}
		
		class SortBasedOnString
		{
			public static void main(String args[])
			{
				ArrayList<Sort> list= new ArrayList<Sort>();
				list.add(new Sort("Pawan" ,20,9.8));
				list.add(new Sort("Kalyan" ,19,9.5));
				list.add(new Sort("Sai" , 21,9.6));
				list.add(new Sort("Ram" ,18,9.5));
				
				Collections.sort(list);
				System.out.println("Students after sorting :");
				for(Sort student: list)
				{
					
					System.out.println(student.getname()+" "+student.getage()+" "+student.getgrade());
				}
				
				
			}
		}
	}
	


