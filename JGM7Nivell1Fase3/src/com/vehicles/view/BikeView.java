package com.vehicles.view;

import javax.swing.JOptionPane;
import com.vehicles.application.VehiclesController;
import com.vehicles.domain.Bike;
import com.vehicles.domain.Wheel;

public class BikeView {
	
	VehiclesController controller;
	
	public BikeView() {
		controller = new VehiclesController();
	}
	
	public void getBikesAndSave() throws Exception {
		boolean seguir = true;

		while (seguir) {
			Bike bike = this.getBike();
			Wheel front = getWheel();
			Wheel back = getWheel();

			controller.createBike(bike, front, back);

			seguir = this.getSeguir();
		}
	}

	private boolean getSeguir() {
		boolean result = false;

		String respuesta = JOptionPane.showInputDialog("Si desea continuar añadiendo motos, escriba 'S'").toUpperCase();

		if (respuesta != null && respuesta.equals("S")) {
			result = true;
		}
		return result;
	}

	public void showBikesList() {
		System.out.println(controller.getAllVehicles());
	}

	private Bike getBike() {
		
		String plate;
		
		do {
			plate = JOptionPane.showInputDialog("Introduzca la matrícula de la moto");
		}while (!plate.matches("[0-9]{4}+[a-zA-Z]{2,3}"));
		
		String brand = JOptionPane.showInputDialog("Introduzca la marca de la moto");
		String color = JOptionPane.showInputDialog("Introduzca el color de la moto");
		return new Bike(plate, brand, color);

	}

	private Wheel getWheel() throws Exception {

		String brand = JOptionPane.showInputDialog("Introduzca marca de la rueda");
		
	double diameter;
		
		do {
			diameter = Double.parseDouble(JOptionPane.showInputDialog("Introduzca diámetro de la rueda"));
		}while (diameter < 0.4 || diameter > 4); 
		
		return new Wheel(brand, diameter);	
	} 
} 
