package com.vehicles.application;

import java.util.List;

import com.vehicles.domain.Car;
import com.vehicles.domain.Bike;
import com.vehicles.domain.Vehicle;
import com.vehicles.domain.Wheel;
import com.vehicles.persistence.VehiclesRepository;

public class VehiclesController {

	private VehiclesRepository repository = new VehiclesRepository();

	public VehiclesController() {

	}

//	public void createCar(String plate, String brand, String color, List<Wheel> frontlist, List<Wheel> backlist)
//			throws Exception {
//
//		Car car = new Car(plate, brand, color);
//		this.createCar(car, frontlist, backlist);
//
//	}

	public void createCar(Car car, List<Wheel> frontlist, List<Wheel> backlist) throws Exception {

		car.addWheels(frontlist, backlist);
		if (car.isValidPlate()) {
			repository.addVehicle(car);

		} else {
			throw new Exception("matrícula no válida");
		}
	}
	
	public void createBike(Bike bike, Wheel frontlist, Wheel backlist) throws Exception {

		bike.addWheels(frontlist, backlist);
		if (bike.isValidPlate()) {
			repository.addVehicle(bike);

		} else {
			throw new Exception("matrícula no válida");
		}
	}

	public String getAllVehicles() {
		StringBuilder sb = new StringBuilder();

		List<Vehicle> vehicles = repository.getAllVehicles();
		if (vehicles != null && vehicles.size() > 0) {
			for (Vehicle v : vehicles) {
				sb.append(v.toString());
				sb.append("\n");
			}
		}
		return sb.toString();
	}
}
