package com;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	    HashMap<String, String> dictionary = new HashMap<>();

	    dictionary.put("arbol", "tree");
	    dictionary.put("araña", "spider");
	    dictionary.put("espía", "spy");
	    dictionary.put("era", "age");
	    dictionary.put("cocodrilo", "crocodile");
	    dictionary.put("tesoro", "treasure");
	    dictionary.put("hola", "hello");
	    dictionary.put("gato", "cat");
	    dictionary.put("casa", "house");
	    dictionary.put("hogar", "home");
	    dictionary.put("sol", "sun");
	    dictionary.put("libro", "book");
	    dictionary.put("agua", "water");
	    dictionary.put("amigo", "friend");
	    dictionary.put("ciudad", "city");
	    dictionary.put("trabajo", "work");
	    dictionary.put("tiempo", "time");
	    dictionary.put("feliz", "happy");
	    dictionary.put("perro", "dog");
	    dictionary.put("comida", "food");
	    dictionary.put("escuela", "school");
	    dictionary.put("craneo", "skull");

	    System.out.println("Diccionario español-inglés");
	    System.out.println("Escribe una palabra en espanol: ");
	    String wordSpanish = in.nextLine();
	    System.out.println(
	      dictionary.containsKey(wordSpanish.toLowerCase())
	        ? dictionary.get(wordSpanish.toLowerCase())
	        : "La palabra no se encuentra en el diccionario."
	    );
	    in.close();
	}
}

/*
Crear un programa en Java que realice lo siguiente:
Crear un diccionario Español-Inglés, que contenga al menos 20 palabras (con traducción).
Utiliza un objeto HashMap para almacenar los pares de palabras.
Debe solicitar al usuario una palabra en español e imprimir por consola la palabra en inglés.
Si la palabra escrita no se encuentra en el diccionario debe imprimir un mensaje por consola, diciendo que: “La palabra no se encuentra en el diccionario.”.
Prueba tu programa con las siguientes entradas para asegurarte que funcione correctamente:
gato
cat
Entradas: 
Salida:
Siempre y cuando la palabra se encuentre en el diccionario
Pruébalo con diferentes palabras.
*/