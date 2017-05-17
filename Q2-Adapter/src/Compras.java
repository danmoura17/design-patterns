
public class Compras {
	
	int IdCliente;
	
	public Compras(int IdCliente){
		this.IdCliente = IdCliente;
	}
	
	public void FinalizarCompra(){
		System.out.println("Finalizando Compra");
	}
	
	public void AdicionarProduto(){
		System.out.println("Adicionando Produto");
	}
	
	public void RetirarProduto(){
		System.out.println("Retirando Produto");
	}

}
