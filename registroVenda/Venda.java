package registroVenda;

public class Venda {


	Produto produto;
	Vendedor vendedor;

	private float desconto;
	private int quantidadeItens;
	private float valor;

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public void setQuantidadeItens(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public boolean efetuarDesconto(float percDesconto, Produto produto, Vendedor vendedor) {

		this.desconto = (produto.getValorVenda() * (percDesconto / 100));
		float valorVenda = produto.getValorVenda() - this.desconto;

		if (valorVenda < produto.getValorCusto()) {
			System.out.println("Desconto inválido!");
			return false;

		} else {
			return true;

		}
	}

	public float calcularValor(Produto produto, Vendedor vendedor) {

		float valorCalculado = (produto.getValorVenda() * (float) this.quantidadeItens) - this.desconto;

		return valorCalculado;

	}

	public float calcularComissao(Produto produto, Vendedor vendedor) {

		float calComissao = 0f;
		if (produto.isPromocao() == true) {
			calComissao = produto.getValorVenda() * ((vendedor.getCOMISSAO() / 100) / 2);
			System.out.println("O valor da comissão é: " + calComissao);

			return calComissao;

		} else {
			calComissao = (produto.getValorVenda() * (vendedor.getCOMISSAO() / 100));
			System.out.println("O valor da comissão é: " + calComissao);

			return calComissao;

		}
	}

	public void imprimir(Produto produto, Vendedor vendedor) {
		System.out.println("Nome do vendedor: " + vendedor.getNome());
		System.out.println("Quantidade de itens: " + this.quantidadeItens);
		System.out.println("Código do produto: " + produto.getCod_Prod() + " Descrição produto: " + produto.getDescricao());
		// System.out.println("O valor da venda: " + this.calcularValor());
		if (produto.isPromocao() == true) {
			System.out.println("O produto está na promoção.");
		} else {
			System.out.println("O produto não está na promoção.");
		}
		
		if(desconto!=0  && this.efetuarDesconto(desconto, produto, vendedor)) {
			System.out.println("Valor do desconto do produto: " + this.desconto);			
		}else {
			System.out.println("Produto não tem desconto.");
		}

		
		System.out.println("Valor total da venda: " + (this.calcularValor(produto, vendedor) - this.desconto));

		return;

	}
}
