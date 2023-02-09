package com.java.polimorfismo;

import com.java.MarioBrosCreation;

public class Main {

	public static void main(String[] args) {
		// Abstraccion y Polimorfismo
		
		Animal ricardo = new Humano();
		ricardo.speak();
		
		ricardo = new Perro();
		ricardo.speak();
		
		ricardo = new Gato();
		ricardo.speak();
		
		MarioBrosCreation mario = new MarioBrosCreation();
//		mario.correr();

	}

}
