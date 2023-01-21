package com.java;

public class Variable {
	
	// Variable de instancia
	int var7;
	
	// Variables estaticas
	public static final String MY_VARIABLE = "Hola mundo";

	public static void main(String[] args) {
		
		// Variable: espacio en memoria que nos ayuda a almacenar informacion.
		
		// 3 Fases: declaracion, inicializacion y utilizacion
		
		// Declaracion
		int var4;
		
		// Inicializarla
		var4 = 11;
		
		// Utilizacion
		int var5;
		var5=2;
		
		int suma = var4+var5; // Aqui se hizo la utilizacion
		
		String texto= "El valor de mi variables var4 es: ";
		System.out.println( texto + var4); // Aqui se hizo la utilizacion
		
		// Concatenar: Unir dos o mas variables en un programa.
		
		// Hay 3 tipos de variables: Locales, de instancia y estaticas.
		
		// Variable local
		boolean var6 = true;
		
		// Variable de instancia (Ver al inicio de la class)
		
		// Variable estaticas (Ver al inicio de la class)
		
		// Datos primitivos - 8 tipos de datos primitivos
		
//		- Byte - numerico entero
//		- Short - numerico entero
//		- Integer - numerico entero ***
//		- Long - numerico entero ***
//		- Float  - numerico reales - 1.3, 1.45, 134.567. 12.5 **
//		- Double - numerico reales ***
//		- Character - A, B, C, D ****
//		- Boolean - Logico - True, False ****
		
		// String: Cadena de caracteres
		
		String var3 = "Hola!";
		
		// TIP: comentar mas de una linea de codigo CTRL+7
		
		int var1 = 1; //32 bits
		
		
		

	}

}
