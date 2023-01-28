package com.java;

public class Ciclos {

	public static void main(String[] args) {

		// Estructuras
//		1- While
//		2- Do While
//		3- For

		// While

		int numero = 1;

		while (numero <= 20) {
			System.out.println("El numero es: " + numero);
			// Logica
			numero++;

			// Lenguaje
			// break;
		}

		// Do While

//		- ¿Cuantas veces se tiene que sumar un numero a si mismo para llegar a 1000?
		int numeroSum = 33;
		int sum = 0;
		int count = 0;
		int numeroLimite = 3000;

		do {
			sum = sum + numeroSum;
			++count;
		} while (sum < numeroLimite);
		
		System.out.println("El numero "+numeroSum + " se sumo a si mismo "+ count + " veces");
		
		// For
		
//		1- Variable de ciclo
//		2- Condicion (TRUE, FALSE)
//		3- Incrementador/Decrementador
		
		int numeroFor = 100;
		
		for(int i =1; i<=numeroFor; i++) {
			System.out.println(i);
		}

	}

}
