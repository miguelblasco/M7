package com.vehicles.view;

public class Main {

	public static void main(String[] args) {

		try {
			OptionsView o = new OptionsView();
				o.opciones();		
		} catch (Exception ex) {

			System.err.println(ex.getMessage());
		}  
	} 
}
