package com.java.herencia;

public class Hijo extends Padre{

	public Hijo(double estatura, String colorCabello) {
		super(estatura, colorCabello);
		
	}
	
	public void jugarFutbol() {
		System.out.println("Jugar Futbol");
	}

}
