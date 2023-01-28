package com.java;

import org.apache.commons.io.FileSystemUtils;

public class MarioBrosGame {

	public static void main(String[] args) {
		MarioBrosCreation mario = new MarioBrosCreation();
		
		mario.hongoMario=false;
		
		mario.correr();
		mario.saltar();
		
		mario.crecer();
		
		System.out.println(" el color del gorro de "+mario.name+" es :"+mario.gorro);
		
		MarioBrosCreation luigi = new MarioBrosCreation();
		luigi.name = "Luigi";
		luigi.gorro = "verde";
		luigi.overol = "morado";
		
		luigi.correr();
		luigi.saltar();
		System.out.println(" el color del gorro de "+luigi.name+" es :"+luigi.gorro);
		
//		Using constructor
		MarioBrosCreation marioPrototype1 = new MarioBrosCreation(false, "azul", "rojo", "pequeño", 2, false, "MArio Prototype1");
		marioPrototype1.correr();

	}

}
