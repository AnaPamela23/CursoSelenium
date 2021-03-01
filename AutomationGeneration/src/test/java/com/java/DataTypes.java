package com.java;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte variableByte = 127;
		int variableInt = 1234;
		System.out.println(variableInt);
		System.out.println(variableByte);

		double altura = 2.54;
		double velocitad = 3;
		System.out.println("Esta es la altura " + altura);
		
//		Se pude volver a usar la variable y ya no es necesario volver a indicar el tipo de dato, solo cambiara el valor de esta por la ultima ingresada
		char letra1 = '\u0045';
		letra1 = '\u004D';
		System.out.println(letra1);
		
		String frase = "Hola";
		String frase2 = " Mundo";
		System.out.println(frase+frase2+ " "+letra1 );
		
		boolean isDog = true;
		isdog = false;
				
				
	}

}
