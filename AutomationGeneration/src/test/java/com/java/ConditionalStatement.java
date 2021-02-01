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

	}
}
