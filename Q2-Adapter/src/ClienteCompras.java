
public class ClienteCompras {
	
	public static void main(String[] args) {
		Compras compras = new Compras(01);
		
		compras.AdicionarProduto();
		compras.RetirarProduto();
		compras.FinalizarCompra();
		
		System.out.println("\n---------------------------------\n");
		
		Compras novoSistemaDeCompras = new ComprasAdapter(02);
		
		novoSistemaDeCompras.AdicionarProduto();
		novoSistemaDeCompras.RetirarProduto();
		novoSistemaDeCompras.FinalizarCompra();
		
		
	}

}
