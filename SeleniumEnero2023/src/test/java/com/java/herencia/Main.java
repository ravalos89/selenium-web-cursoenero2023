package com.java.herencia;

public class Main {

	public static void main(String[] args) {
		// Herencia
		
		//Superclasses y subclasses
		
		//Una superclase puede tener N subclasses
		//Una subclase solo puede tener una superclasse
		
		Padre juan = new Padre(1.70, "Cafe oscuro");
		Hijo ricardo = new Hijo(1.74, "Cafe oscuro");
		Nieto ricardito = new Nieto(1, "Cafe claro");
		
		juan.jugarBaseball();
		
		ricardo.hacerEjercicio();
		
		ricardito.jugarBaseball();
		ricardito.jugarFutbol();
		
		// Encapsulacion (Encapsulation)
		
		// Es un mecanismo que nos permite envolver datos (Variables) y el codigo que actua
//		sobre los mismos como si fuera una sola unidad
		
		// una caracteristica de la encapsuñation solo se puede acceder a los metodos atravez de 
//		la clase actual
		
		// DAO (Data Access Object) - Enfocados a la encapsulacion
		
		// Getters and Setters
		//juan.colorCabello = "Verde";
		juan.setColorCabello("Rojo");
		//System.out.println("Juan tiene el color de cabello "+juan.getColorCabello());
	}

}
