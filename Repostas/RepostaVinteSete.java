package Repostas;

import java.util.Scanner;

public class RepostaVinteSete {
	public static void main(String[] args) {
		
		System.out.println("27.Faça um programa para ler um número do teclado e imprimir na tela se ele é\r\n"
				+ "par ou ímpar. Imprima também se ele é primo.");
		
		
		
		
		Scanner num = new Scanner(System.in);
		System.out.println("Digite seu número: ");
		int valorA = num .nextInt();
		
		
		int contador = 0;
		
		if (valorA % 2 == 0) {
			System.out.println("O número " + valorA + " é par");
		}else {
			System.out.println("O número " +valorA + " é impar");
		}
		
	
		for ( int aux = 1; aux <=valorA; aux ++) {
			if (valorA%aux ==0) {
				contador++;
			}
			
		
		}

		if (contador == 2){
			System.out.println("O número " + valorA + " é primo");
			}
	
	}

	}
