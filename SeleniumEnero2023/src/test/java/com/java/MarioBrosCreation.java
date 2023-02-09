package com.java;

public class MarioBrosCreation {
	
	//Estados - State (Variable de instancia)
	boolean isalive = true;
	String overol = "azul";
	String gorro = "rojo";
	String marioState = "Grande";
	int numPiernas = 2;
	boolean hongoMario = true;
	String name = "MArio";
	
	// Constructor
	
//	Es metodo especial de una clase que sirve para construir el objeto
	
//	Caracteristicas:
//		1- Tiene el mismo nombre de la clase.
//		2- No se hereda.
//		3- No devuelve ningun valor
//		4- un constructor se puede sobrecargar
	
	
	public MarioBrosCreation(boolean isalive, String overol, String gorro, String marioState, int numPiernas,
			boolean hongoMario, String name) {
		this.isalive = isalive;
		this.overol = overol;
		this.gorro = gorro;
		this.marioState = marioState;
		this.numPiernas = numPiernas;
		this.hongoMario = hongoMario;
		this.name = name;
	}
	
	// Constructor overloaded
	public MarioBrosCreation(String overol, String gorro, boolean hongoMario) {
		this.isalive = true;
		this.overol = overol;
		this.gorro = gorro;
		this.marioState = "Pequeño";
		this.numPiernas = 2;
		this.hongoMario = hongoMario;
		this.name = "Mario";
	}
	
	public MarioBrosCreation() {
		
	}



	// Comportamientos
	void correr() {
		System.out.println(name+" esta corriendo");
	}
	public void saltar() {
		System.out.println(name+" esta saltando");
	}
	
	public void crecer() {
		if(hongoMario) {
			System.out.println(name+" crecio");
		}
	}

}
