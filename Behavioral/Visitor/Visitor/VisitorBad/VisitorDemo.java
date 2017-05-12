package com.pluralsight.visitorbad;

public class VisitorDemo {

	public static void main(String[] args) {
		PartsOrder order = new PartsOrder();
		order.addPart(new Wheel());
		order.addPart(new Fender());
		order.addPart(new Oil());
		
		double shippingCost = order.calculateShipping();
		
		System.out.println(shippingCost);
	}
}
