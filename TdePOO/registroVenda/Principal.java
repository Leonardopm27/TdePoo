package registroVenda;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Produto lapis = new Produto(1,"Preto",100f, 80f, false);
		Vendedor vendedor1 = new Vendedor("Ricardo", 2, "rua bonita");		
		Venda venda1 = new Venda();
		venda1.calcularValor();
		//venda1.calcularComissao();
		//System.out.println(venda1.calcularComissao());
		//System.out.println(venda1.calcularValor());
		
		
        
        
        
      // venda1.calcularValor();
       //System.out.println(venda1.calcularValor());
		
		
        
        		
		
		
		

	}

}
