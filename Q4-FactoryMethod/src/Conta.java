
public abstract class Conta {
	
	private String conta;
	
	public Conta(String conta){
		this.setConta(conta);
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}
	
	public abstract void criar();

}
