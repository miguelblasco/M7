package com.vehicles.domain;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);
	}
	
	public void addWheels(Wheel frontWheel, Wheel backWheel) throws Exception {
		addOneWheel(frontWheel);
		addOneWheel(backWheel);
	}

	public void addOneWheel(Wheel wheel) throws Exception {
		
		this.wheels.add(wheel);
	}

	@Override
	public String toString() {
		return "Bike [Matr�cula =" + plate + ", Marca =" + brand + ", Color =" + color + ", Ruedas =" + wheels + "]";
	}
}


