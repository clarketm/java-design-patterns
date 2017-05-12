package com.pluralsight.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyEverydayDemo {
	
	private static void printContents(List<Person> people) {
		for (Person person : people) {
			System.out.println(person.getName());
		}
	}
	
	public static void main(String args[]) {
		Person bryan = new Person("Bryan", "801-555-1212", 39);
		Person mark = new Person("Mark", "801-444-1234", 41);
		Person chris = new Person("Chris", "801-222-5151", 38);
		
		List<Person> people = new ArrayList<Person>();
		people.add(bryan);
		people.add(mark);
		people.add(chris);
		
		System.out.println("Not sorted");
		printContents(people);
		
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				if(o1.getAge() > o2.getAge()) {
					return 1;
				}
				
				if(o1.getAge() < o2.getAge()) {
					return -1;
				}
				
				return 0;
			}
		});
		
		System.out.println("\nSorted by age");
		printContents(people);
		
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		System.out.println("\nSorted by name");
		printContents(people);
		
	}
}
