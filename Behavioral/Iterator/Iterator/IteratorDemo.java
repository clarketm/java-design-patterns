package com.pluralsight.iterator;

import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		BikeRepository repo = new BikeRepository();
		
		repo.addBike("Cervelo");
		repo.addBike("Scott");
		repo.addBike("Fuji");
		
		Iterator<String> bikeIterator = repo.iterator();
		
		//while(bikeIterator.hasNext()) {
		//	System.out.println(bikeIterator.next());
		//}
		
		for (String bike : repo) {
			System.out.println(bike);
		}
	}
}
