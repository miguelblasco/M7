package com.vehicles.view;

public class Main {

	public static void main(String[] args) {

		try {
			View v = new View();
			v.getCarsAndSave();
			v.showCarsList();

		} catch (Exception ex) {

			System.err.println(ex.getMessage());
		}
	}

}
