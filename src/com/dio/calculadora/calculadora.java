package com.dio.calculadora;

import java.util.Scanner;//importando biblioteca pra ler dados 

public class calculadora {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			float a,b;
	
			System.out.print("Digite o primeiro valor: ");
			a = scan.nextInt();
			System.out.print("Digite o segundo valor: ");
			b = scan.nextInt();
			
			
			float soma= soma(a,b);
			float subtracao= subtracao(a,b);
			float multiplicacao= multiplicacao(a,b);
			float divisao= divisao(a,b);
			
			System.out.println("A soma � = "+soma);
			System.out.println("A subtra��o � = "+subtracao);
			System.out.println("A multiplica��o � = "+multiplicacao);
			System.out.println("A divis�o � = "+divisao);
		}
		
		//metodos
	}
	
	public static float soma(float a, float b) {
		return a+b;
	}
	public static float subtracao(float a, float b) {
		return a-b;
	}
	public static float multiplicacao(float a, float b) {
		return a*b;
	}
	public static float divisao(float a, float b ) {
		return a/b;
	}
	
	
	
}
