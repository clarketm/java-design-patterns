package com.pluralsight.memento;

public class MementoDemo {

	public static void main (String args[]) {
	
		Caretaker caretaker = new Caretaker();
		
		Employee emp = new Employee();
		
		emp.setName("John Wick");
		emp.setAddress("111 Main Street");
		emp.setPhone("888-555-1212");
		
		System.out.println("Employee before save:                     " + emp);
		
		caretaker.save(emp);
		
		emp.setPhone("444-555-6666");
		
		caretaker.save(emp);
		
		System.out.println("Employee after changed phone number save: " + emp);
		
		emp.setPhone("333-999-6666"); // <--- we haven't called save!
		
		caretaker.revert(emp);
		
		System.out.println("Reverts to last save point:               " + emp);
		
		caretaker.revert(emp);
		
		System.out.println("Reverted to original:                     " + emp);
		
	}
}
