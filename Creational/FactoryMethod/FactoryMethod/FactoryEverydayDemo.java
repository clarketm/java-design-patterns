package FactoryMethod;

import java.util.Calendar;

public class FactoryEverydayDemo {

	public static void main(String args []) {
		
		Calendar cal = Calendar.getInstance();
		//Calendar cal = Calendar.get
		
		System.out.println(cal);
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	}
	
}
