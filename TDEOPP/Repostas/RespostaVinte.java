package Repostas;

import java.util.Scanner;

import org.w3c.dom.Text;

public class RespostaVinte {
	public static void main(String[] args) {
		System.out.println("20.Crie uma variável inteira com um valor qualquer e verifique se o valor desta\r\n"
				+ "variável é menor que 15 ou maior que 100.");
		
		Scanner texto = new Scanner(System.in);
		int valorA = Integer.parseInt(texto.nextLine());;
		
		if (valorA < 15 || valorA >100) {
			System.out.println("Valor válido.");
		}else {
			System.err.println("Valor inválido");
		}
	
		System.out.println("21.Crie uma variável com valor de ponto flutuante com um valor qualquer e\r\n"
				+ "verifique se o valor desta variável está entre 1.99 e 5.99.\r\n"
				+ "");
		
		double valorB = Double.parseDouble(texto.nextLine());
		System.out.println(valorB);
		
		if (valorB < 1.99 || valorB < 5.99) {
			System.out.println("Valor válido");
		}else {
			System.err.println("Valor inválido");
			
		}
		
		System.out.println("22. Agora compare se o valor das duas variáveis acima é igual.");
		
		if (valorA == valorB) {
			System.out.println("Valores igual");
		}else {
			System.err.println("Valores diferentes");
		}
		
		System.out.println("23.Calcule o valor da multiplicação de um int por um double, atribuindo o valor a\r\n"
				+ "um int.\r\n"
				+ "");
		
		double divisao = valorA / valorB;
		System.out.println(divisao);
		
		
		
	}

}
