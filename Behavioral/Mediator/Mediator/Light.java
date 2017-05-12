package com.pluralsight.mediator;

//receiver
public class Light {

	private boolean isOn = false;
	
	private String location = "";
	
	public Light() {
		
	}
	
	public Light(String location) {
		this.location = location;
	}
	
	public boolean isOn() {
		return isOn;
	}
	
	public void toggle() {
		if(isOn) {
			off();
			isOn = false;
		}
		else {
			on();
			isOn = true;
		}
	}
	
	public void on() {
		System.out.println(location + " Light switched on.");
	}
	
	public void off() {
		System.out.println(location + " Light switched off.");
	}
}
