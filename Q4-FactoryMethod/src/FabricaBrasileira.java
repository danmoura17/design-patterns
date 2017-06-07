
public class FabricaBrasileira extends FabricaDeConta{

	@Override
	public Conta criarConta(String conta) {
		super.conta = new ContaBrasileira(conta);
		return super.conta;
	}

}
