
public class ComprasAdapter extends Compras{
	private NovoSistemaCompras novoSistema;

	public ComprasAdapter(int IdCliente) {
		super(IdCliente);
		this.novoSistema = new NovoSistemaCompras(IdCliente);
	}
	
	public void FinalizarCompra(){
		this.novoSistema.registrarOperacao(true, true);
	}
	
	public void AdicionarProduto(){
		this.novoSistema.registrarOperacao(false, true);
	}
	
	public void RetirarProduto(){
		this.novoSistema.registrarOperacao(false, true);
	}

}
