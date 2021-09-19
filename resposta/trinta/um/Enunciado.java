package resposta.trinta.um;

import java.util.Scanner;

public class Enunciado {
	public static void main(String[] args) {
		System.out.println("31.Existem 454 gramas em uma libra, e 1000 gramas em um quilo. Faça um\r\n"
				+ "programa que converta quilos para libras e vice-versa. (Dica: use um\r\n"
				+ "caractere indicando a ordem da conversão, exemplo \"java q 1000\" seria o\r\n"
				+ "comando para converter 1000 quilos para libra, e \"java l 1000\" seria o\r\n"
				+ "comando para converter 1000 libras para quilo.\r\n"
				+ "");
		
		
		Scanner texto = new Scanner(System.in);
		
		System.out.println("Escolha o seu comando: " + "\n"+ "('java q 1000' para converter kilo para libra)" + "\n" + "('java l 1000' para libra para kilo)") ;
		
		String escolha = texto.nextLine();
		
		Conversao novo = new Conversao();
		
		if(escolha.equalsIgnoreCase("java q 1000")) {
			
			novo.quilo();
			
			
		}
		else if(escolha.equalsIgnoreCase("java l 1000")) {
			
			novo.libra();
			
		}
		
	}
	
	
	


}
