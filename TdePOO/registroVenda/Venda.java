package registroVenda;

public class Venda {
	
	//Produto lapis = new Produto(1, "Preto", 100.00f, 80.00f, false);
	//Vendedor colaborador = new Vendedor("Ricardo", 2, "rua bonita");
	
	// private float valorVenda = lapis.getValorVenda();
	//private float valorCusto = lapis.getValorCusto();
	//private float valorComi = colaborador.getCOMISSAO();
	//private boolean promocao = lapis.isPromocao();
	//private String nomeVend= colaborador.getNome();
	//private int codProd = lapis.getCod_Prod();
	//private String descr = lapis.getDescriçao();
	

	Produto produto;
	Vendedor vendedor; 	
	private float desconto;
	private int  quantidadeItens;
	private float valor;
	
	float valorVenda = produto.getValorVenda();
	
	
	
	

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


	

	public void calcularValor() {
	float valorCalculado = ((float)this.quantidadeItens *valorVenda)-desconto;
	System.out.println(valorCalculado);
	
	return ;
	

	}

	
		
		
		
		
	}


