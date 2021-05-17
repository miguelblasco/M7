package com.vehicles.view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.vehicles.application.VehiclesController;
import com.vehicles.domain.Car;
import com.vehicles.domain.Wheel;

public class CarView {

	VehiclesController controller;

	public CarView() {
		controller = new VehiclesController();
	}

	public void getCarsAndSave() throws Exception {
		boolean seguir = true;

		while (seguir) {
			Car car = this.getCar();
			Wheel front1 = getWheel();
			Wheel front2 = getWheel();
			Wheel back1 = getWheel();
			Wheel back2 = getWheel();

			List<Wheel> frontlist = new ArrayList<Wheel>();
			frontlist.add(front1);
			frontlist.add(front2);

			List<Wheel> backlist = new ArrayList<Wheel>();
			backlist.add(back1);
			backlist.add(back2);
			controller.createCar(car, frontlist, backlist);

			seguir = this.getSeguir();
		}
	}

	private boolean getSeguir() {
		boolean result = false;

		String respuesta = JOptionPane.showInputDialog("Si desea continuar añadiendo coches, escriba 'S'").toUpperCase();

		if (respuesta != null && respuesta.equals("S")) {
			result = true;
		}
		return result;
	}

	public void showCarsList() {
		System.out.println(controller.getAllVehicles());
	}

	private Car getCar() {
		
		String plate;
		
		do {
			plate = JOptionPane.showInputDialog("Introduzca la matrícula del coche");
		}while (!plate.matches("[0-9]{4}+[a-zA-Z]{2,3}"));
		
		String brand = JOptionPane.showInputDialog("Introduzca la marca del coche");
		String color = JOptionPane.showInputDialog("Introduzca el color del coche");
		return new Car(plate, brand, color);
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
