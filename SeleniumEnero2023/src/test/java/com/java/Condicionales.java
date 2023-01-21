package com.java;

public class Condicionales {

	public static void main(String[] args) {
		
		// Condicionales
		
//		if
//		
//		if else
//			
//		if anidado - nested if
//		
//		if else if
//		
//		switch
		
		int velocidadActualcoche = 71; //Km*h
		int velocidadLimite = 70; //km*h
		
		boolean carretera = false;
		
		if(carretera==true) {
			velocidadLimite = 100;
			
			if(velocidadActualcoche>velocidadLimite) {
				// Block code
				System.out.println("Carretera - Multa");
			}else {
				System.out.println("Carretera - Eres un buen conductor");
			}
			
		}else if(velocidadActualcoche>velocidadLimite) {
			// Block code
			System.out.println("Calle - Multa");
		}else {
			System.out.println("Calle - Eres un buen conductor");
		}
		
		// Ejercicios de tarea
		
//		1 - Vamos a realizar un programa que sume 3 variables.
//		2 - Realizar un programa que concatene 3 strings para formar una frase;
//		3 - Terminar el ejercicio de las fotomultas agregando Zona escolar.
		
		

	}

}
