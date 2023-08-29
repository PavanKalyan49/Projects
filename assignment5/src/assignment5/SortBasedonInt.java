package assignment5;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	private String name;
	private int age;
	private double grade;
	
	public int compareTo(Student  s)
	{
		return Integer.valueOf( s.age-this.age);
		
	}
	
	
	public Student(String nm,int ag,double g)
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
		
		class SortBasedonInt
		{
			public static void main(String args[])
			{
				ArrayList<Student> list= new ArrayList<Student>();
				list.add(new Student ("Pawan" ,20,9.8));
				list.add(new Student ("Kalyan" ,19,9.5));
				list.add(new Student("Sai" , 21,9.6));
				list.add(new Student ("Ram" ,18,9.5));
				
				Collections.sort(list);
				System.out.println("Students after sorting :");
				for(Student  student: list)
				{
					
					System.out.println(student.getname()+" "+student.getage()+" "+student.getgrade());
				}
				
				
			}
		}
	}
	


