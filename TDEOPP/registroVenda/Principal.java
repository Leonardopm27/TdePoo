package registroVenda;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Produto tesoura = new Produto(2, "Tesoura", 50f, 30f, false);
		Vendedor ricardo = new Vendedor("Ricardo", 2, "Rua Bonita");
		Venda venda = new Venda();

		venda.setQuantidadeItens(2);

		venda.calcularValor(tesoura, ricardo);

		venda.calcularComissao(tesoura, ricardo);

		venda.imprimir(tesoura, ricardo);

		System.out.println("=============================VENDA 2=============================");

		Produto lapis = new Produto(1, "Lápis", 100.00f, 80.00f, true);
		Vendedor maria = new Vendedor("Maria", 1, "Rua Elegante");
		Venda venda2 = new Venda();

		venda2.setQuantidadeItens(3);
		venda2.efetuarDesconto(10, lapis, maria);
		venda2.calcularValor(lapis, maria);

		venda2.calcularComissao(lapis, maria);
		venda2.imprimir(lapis, maria);

		System.out.println("=============================VENDA 3=============================");

		Venda venda3 = new Venda();
		venda3.setQuantidadeItens(2);
		venda3.efetuarDesconto(30, lapis, maria);
		venda3.calcularValor(lapis, maria);
		venda3.calcularComissao(lapis, maria);
		venda3.imprimir(lapis, maria);

	}

}
