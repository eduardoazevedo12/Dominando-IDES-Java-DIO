package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato(null, null, null);
		Livros livros = new Livros();
		System.out.println(gato);
		System.out.println(livros);
		
		/*int a=2;
		int b=3;
		System.out.println("Hellow World");
		System.out.println("Primeiro contato no Eclipse");
		System.out.println("A= " +a+ " B=" +b);
		System.out.println("A+B="+(a+b));
		*/
	}

	}

class Livros {
	private String nome;
	private String npag;
}
