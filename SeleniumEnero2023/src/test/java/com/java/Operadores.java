package com.java;

public class Operadores {

	public static void main(String[] args) {
		
		// Son los signos o simbolos ya sean aritmeticos o por asignacion que interactuan con las variables
		
//		- Aritmeticos
//		- Unarios
//		- Relacionales
//		- Condicionales
//		- Bit
		
		// Aritmeticos (suma, resta multiplicacion y division)
		
//		suma +
//		resta -
//		multiplicacion *
//		division /
		
		int var1 = 10;
		int var2 = 5;
		
		int aritmetico = (var1/var2)-2;
		
		System.out.println("El resultado es: " + aritmetico);
		
		// Unarios (++, --, !)
		int var3= 5;
		var3--;
		var3--;
		
		System.out.println(var3);
		
		// Relacionales (==, !=, >, >=, <, <=)
		
		int var4=1;
		int var5=2;
		
		if(var4<var5) {
			System.out.println("Verdadero");
		}else {
			System.out.println("Falso");
		}
		
		// Condicionales (AND && - OR ||)
		
		int var6=2;
		int var7=2;
		
		if(var4==var5 || var6!=var7 && var1==var2) {
			System.out.println("Verdadero - Condicional");
		}else {
			System.out.println("Falso - Condicional");
		}
		
		//Bit (& |)
		
		
		

	}

}
