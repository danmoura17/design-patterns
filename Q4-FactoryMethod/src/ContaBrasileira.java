
public class ContaBrasileira extends Conta{

	public ContaBrasileira(String conta) {
		super(conta);
	}

	@Override
	public void criar() {
		System.out.println("Criada conta Brasileira");
		
	}

}
