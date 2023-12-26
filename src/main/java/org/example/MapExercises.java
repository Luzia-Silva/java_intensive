package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapExercises {
	public static void main(String args[]){
		Map<String, Integer> frase = new HashMap();
		String fraseUsuario = "Eu estou aprendendo Java , porém Java é complicado! complicado!";
		String[] fraseArray = fraseUsuario.split(" ");
		
		int indice = 0;
		for(String palavra : fraseArray){
			frase.put(palavra, indice);
			indice++;
			System.out.println(palavra + indice);
		}
		
	}
	
}
