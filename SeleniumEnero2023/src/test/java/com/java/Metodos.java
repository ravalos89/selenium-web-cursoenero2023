package com.java;

public class Metodos {

	public static void main(String[] args) {
		// MEtodo = Funcion
//		
//		Metodo: instrucciones definidas dentro de una clase, que realizan
//		una determinada tarea.
		
//		1- Siempre pertenece a una clase, no se puede escribir fuera d euna clase
//		2- No se puede escribir metodo dnetro de otro metodo.
//		3- Un metodo puede regresar (return) cualquier tipo de dato (int, double, string etc)
//		sino regresa un dato es un metodo void
//		4- Un metodo se puede invocar dentro de otro metodo
		
		sayHola();
		//sayAdios();
		
		int sumMetodo= suma(100,200);
		System.out.println("La suma es: "+sumMetodo);
		
		boolean isnumMayor10 = numMayor10(9);
		System.out.println("el numero 9 es mayor a 10? "+isnumMayor10);
		
		suma(1,2);
		suma(2,3);
		suma(50, 60);
		suma(2,2,3);
	}
	
	
	public static void sayHola() {
		sayAdios();
		System.out.println("Hola, soy el metodo void");
		
	}
	
	public static void sayAdios() {
		System.out.println("Adios");
	}
	
	public static int suma(int x, int y) {
		int suma = x+y;
		return suma;
	}
	
	public static boolean numMayor10(int x) {
		if(x>10) {
			return true;
		}else {
			return false;
		}
	}
	
	// Sobrecarga de methods / Overloading
	
//	Overloaded method - Metodo sobrecargado
	public static int suma(int x, int y, int z) {
		int suma = x+y+z;
		return suma;
	}
	
	public static int suma(int x, int y, boolean z) {
		int suma = x+y;
		return suma;
	}

}
