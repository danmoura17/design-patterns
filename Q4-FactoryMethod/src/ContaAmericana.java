
public class ContaAmericana extends Conta{

	public ContaAmericana(String conta) {
		super(conta);
	}

	@Override
	public void criar() {
		System.out.println("Criada conta Americana");
		
	}

}