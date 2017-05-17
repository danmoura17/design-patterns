
public class NovoSistemaCompras {
	
	int IdCliente;
	
	public NovoSistemaCompras(int IdCliente){
		this.IdCliente = IdCliente;
	}
	
	public void registrarOperacao(boolean finalizouCompra, boolean adicionouProduto){
		
		if(finalizouCompra==true){
			System.out.println("Compra realizada com sucesso no novo sistema");
		}else{
			if(adicionouProduto==true){
				System.out.println("Adicionou produto no novo sistema");
			}else {
				System.out.println("retirou produto no novo sistema");
			}
		}
	}
		

}
