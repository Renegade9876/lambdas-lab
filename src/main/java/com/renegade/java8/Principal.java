package com.renegade.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.javanme.java8.*;

public class Principal {

	public static void main(String[] args) {
		Basico basico = new Basico();
		
		List<String> palabras = Arrays.asList("Cali", "es", "cali", "lo", "demás", "es", "loma");
		basico.ejercicio1(palabras);
		basico.ejercicio2(palabras);
		basico.ejercicio3(palabras); 
		
	}

}
