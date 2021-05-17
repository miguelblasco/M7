package com.vehicles.view;

import javax.swing.JOptionPane;




public class OptionsView {
	
	public void opciones() throws Exception {
		
		int opcion;
		String opcion1;
		
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Escoge una opción: \n1: Coche \n2: Moto \n3: Salir"));
			opcion1 = String.valueOf(opcion); //convertimos "opcion" que es un int en un string
			
			if (!"3".equals(opcion1)) {
				switch (opcion) {
				
					case 1:
						CarView c = new CarView();
						c.getCarsAndSave();
						c.showCarsList();	
					break;
						
					case 2:
						BikeView b = new BikeView();
						b.getBikesAndSave();
						b.showBikesList();
						
					break;
					
					default: 
						System.out.println("La opción escogida es incorrecta");
				}
			}

		}while (!"3".equals(opcion1));
	}
}
