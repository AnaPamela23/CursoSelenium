package com.java;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int velocidad = 80; //KM/H
		int limiteVelocidad = 80;
		
//		if (velocidad >= limiteVelocidad) {
//			System.out.println("El coche va a exceso de velocidad");
//		}else {
//			System.out.println("El coche va a velocidad adecuada");
//		}
		
	//IF ANIDADO / IF ELSE
	
	boolean carretera = true;
	if (carretera) {
		
		System.out.println("Estas en una carretera");
		
		limiteVelocidad = 110; // KM/H
		if (velocidad >= limiteVelocidad) {
			System.out.println("El coche va a exceso de velocidad");
		}else {
			System.out.println("El coche va a velocidad adecuada");
		}
		
	}else if (velocidad > limiteVelocidad) {
		System.out.println("El coche esta en una calle y va a exceso de velocidad");
	}else {
		System.out.println("El coche esta en una calle y va a una velocidad adecuada");
	}
//	SWITCH CASE
	
	int temperatura = 5;
	switch (temperatura) {
	
	case 5:
		System.out.println("Mucho frio");
		break;
	
	case 10:
		System.out.println("frio");
		break;
		
	case 20:
		System.out.println("Clima agradable");
		break;
		
	case 30:
		System.out.println("Calor");
		break;
	
	default:
		System.out.println("No encontro relacion con la temperatura");
	}
}
}