package com.java.herencia;

public class Padre {
	
	// State
	private double estatura;
	private String colorCabello;
	
	public Padre(double estatura, String colorCabello) {
		this.estatura = estatura;
		this.colorCabello = colorCabello;
	}
	
	public void hacerEjercicio() {
		System.out.println("Hacer ejercicio");
	}
	
	public void jugarBaseball() {
		System.out.println("Jugar baseball");
	}
	
	// Getters and Setters

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public String getColorCabello() {
		return colorCabello;
	}

	public void setColorCabello(String colorCabello) {
		if(colorCabello=="Verde") {
			this.colorCabello = "Color de Cabello no valido";
		}else {
			this.colorCabello = colorCabello;	
		}
		
	}
	
	
	
	

}
