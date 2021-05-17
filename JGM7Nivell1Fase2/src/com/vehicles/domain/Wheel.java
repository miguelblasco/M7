package com.vehicles.domain;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) {
		this.brand = brand;
		this.diameter = diameter;
	}


	@Override
	public String toString() {
		return "Wheel [Marca =" + brand + ", Diámetro =" + diameter + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wheel other = (Wheel) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		return true;
	}
	
	public void setDiameter(double diameter) throws Exception {
		if (diameter >= 0.4 && diameter <= 4) {
			this.diameter = diameter;
			
		}
		else throw new Exception ("diámetro incorrecto");
	}
}
