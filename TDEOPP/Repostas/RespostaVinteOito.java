package Repostas;

import java.util.Scanner;

public class RespostaVinteOito {
	public static void main(String[] args) {
		
		System.out.println("28.Determine a quantidade de homens e mulheres (separadamente) que são\r\n"
				+ "maiores de idade, baseado na leitura de dados de 10 pessoas.\r\n"
				+ "");

		int contH = 0;
		int contM = 0;
		Scanner texto = new Scanner(System.in);

		System.out.println("Informe seu gênero (masculino ou feminino): ");

		for (int i = 0; i <= 10; i++) {

			String genero = texto.nextLine();

			if (genero.equalsIgnoreCase("masculino")) {
				
				System.out.println("Informe sua idade: ");

				int idade = Integer.parseInt(texto.nextLine());			
				
					if (idade >=18) {
						contH++;
					}else {
						System.out.println("Menor de idade");
					}

			}

			else if (genero.equalsIgnoreCase("feminino")) {
				

				System.out.println("Informe sua idade: ");
				
				int idade1 = Integer.parseInt(texto.nextLine());

					if (idade1 >= 18) {
					contM++;
					
				} else {
					System.out.println("Menor de idade");
				}
					
			} 
			else {
				System.out.println("Opçao errada");
				i--;

		}
		
		System.out.println("Existem "+ contH + " maiores de idade") ;
		System.out.println("Existem " +  contM + " maiores de idade");

	}

}
}