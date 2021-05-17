package com.vehicles.domain;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels;

	public Vehicle(String plate, String brand, String color) {
		this.plate = plate;
		this.brand = brand;
		this.color = color;
		wheels = new ArrayList<Wheel>();
	}

	public boolean isValidPlate() {
		
		return plate.matches("[0-9]{4}+[a-zA-Z]{2,3}");
	}

	@Override
	public String toString() {
		return "Vehicle [Matrícula =" + plate + ", Marca =" + brand + ", Color =" + color + ", Ruedas =" + wheels + "]";
	}

}
