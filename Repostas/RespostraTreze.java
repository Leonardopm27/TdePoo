package Repostas;

import java.util.Scanner;

public class RespostraTreze {

	public static void main(String[] args) {

		System.out.println("13.Declare três variáveis com tipos diferentes, sem atribuir valor. Depois atribua\r\n"
				+ "um valor qualquer a elas com dados digitados pelo usuário.\r\n" + "");

		Scanner texto = new Scanner(System.in);

		System.out.println("Escreva uma frase: ");
		String frase = texto.nextLine();
		System.out.println("A frase foi: " + frase);

		System.out.println("Escreva um número inteiro : ");
		int numerointeiro = Integer.parseInt(texto.nextLine());
		System.out.println("O numero inteiro foi: " + numerointeiro);

		System.out.println("Escrava um número quebrado: ");
		double numeroquebrado = Double.parseDouble(texto.nextLine());
		System.out.println("O número foi: " + numeroquebrado);

	}
}
