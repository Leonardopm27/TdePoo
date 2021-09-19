package registroVenda;

public class Vendedor  {
	private String nome;
	private int cod_Vendedor;
	public static  float COMISSAO  =  15.0f;
	private String endereco;
	
	
	
	public Vendedor(String nome, int cod_Vendedor, String endereco) {
		super();
		this.nome = nome;
		this.cod_Vendedor = cod_Vendedor;
		this.endereco = endereco;
	}
	
	public int getCod_Vendedor() {
		return cod_Vendedor;
	} 
	public void setCod_Vendedor(int cod_Vendedor) {
		this.cod_Vendedor = cod_Vendedor;
	} 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
 	public static float getCOMISSAO() {
		return COMISSAO;
	}
	public static void setCOMISSAO(float cOMISSAO) {
		COMISSAO = cOMISSAO;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	

}
