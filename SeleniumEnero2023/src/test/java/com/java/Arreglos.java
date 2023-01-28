package com.java;

import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {
		// Arreglo - Array
		
//		Arreglo - se define como objetos en los que podemos guardar mas de una variable,
//		esto de acuerdo a su tamaño y capacidad.
		
//		Unidimensionales
//		Bidimensionales
//		Multidimensionales
		
		// Unidimensional
		
		String[] dias = {"L", "M", "Mi", "J", "V", "S", "D"};

		System.out.println("El dia de hoy es: "+dias[5]);
		
		int var1 = 0;
		String[] frutas = new String[3];
		frutas[var1] = "Naranja";
		frutas[1] = "Banana";
		frutas[2] = "Limon";
		
		System.out.println("La fruta es : "+frutas[1]);
		
		// Bidimensional
		String[][] nombres = new String[2][2];
		nombres[0][0] = "Ricardo";
		nombres[0][1] = "Avalos";
		nombres[1][0] = "Pepito";
		nombres[1][1] = "HEredia";
		
		System.out.println("El nombre es: "+nombres[0][0]+nombres[0][1]);
		
		// Print Array
		System.out.println(Arrays.deepToString(nombres));
		
		// Muktidimensionales
		boolean[][][][][] arraydim = new boolean[10][10][10][10][10];
		
	}

}
