package registroVenda;

public class Produto {

	private int cod_Prod;
	private String descricao;
	private float valorVenda;
	private float valorCusto;
	private boolean promocao;
	
	
	

	public Produto(int cod_Prod, String descricao, float valorVenda, float valorCusto, boolean promocao) {
		super();
		this.cod_Prod = cod_Prod;
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCusto = valorCusto;
		this.promocao = promocao;
	}

	public int getCod_Prod() {
		return cod_Prod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setCod_Prod(int cod_Prod) {
		this.cod_Prod = cod_Prod;
	}

	public float getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}

	public float getValorCusto() {
		return valorCusto;
	}

	public void setValorCusto(float valorCusto) {
		this.valorCusto = valorCusto;
	}

	public boolean isPromocao() {
		return promocao;
	}

	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}
}
