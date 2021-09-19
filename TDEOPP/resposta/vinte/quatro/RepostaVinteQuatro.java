package resposta.vinte.quatro;

public class RepostaVinteQuatro {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	 System.out.println("Class MAIN");
	 Veiculo veiculo = new Veiculo();
	 veiculo.abastecer();
	 veiculo.acelerar();
	 veiculo.frear(); 
	 
	 Automovel automovel = new Automovel();
	 System.out.println("Objeto Automovel");
	 
	 automovel.abastecer();
	 automovel.acelerar();
	 automovel.passarMarcha();
	 automovel.frear();
	 
	 Veiculo veicAuto = new Automovel();
	 System.out.println("Objeto Veiculo-Automovel");
	 veicAuto.abastecer();
	 veicAuto.acelerar();
	 veicAuto.frear();

	 Ferrari ferrari = new Ferrari();
	 System.out.println("Objeto Ferrari");
	 ferrari.abastecer();
	 ferrari.acelerar();
	 ferrari.frear();	
	 ferrari.passarMarcha();
	 
	 Fusca fusca = new Fusca();
	 System.out.println("Objeto Fusca");
	 fusca.abastecer();
	 fusca.acelerar();
	 fusca.frear();	
	 fusca.passarMarcha(); 		 
	 
	 Moto moto = new Moto();
	 System.out.println("Objeto Moto");		 
	 moto.abastecer();
	 moto.acelerar();
	 moto.buzinar();
	 moto.frear();
	 
	 Veiculo veicMoto = new Moto();
	 System.out.println("Objeto Veiculo-Moto");		 
	 veicMoto.abastecer();
	 veicMoto.acelerar();
	 veicMoto.frear();
	 
}

}


