
public class FabricaAmericana extends FabricaDeConta{

	@Override
	public Conta criarConta(String conta) {
		super.conta = new ContaAmericana(conta);
		return super.conta;
	}

}
