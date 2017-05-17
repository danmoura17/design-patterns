
public class Cliente implements Observer{
	
	private String nomeCliente;
	private Subject subject;

	@Override
	public void update(String nomeProduto) {
		System.out.println("Oi " + nomeCliente + ", " + nomeProduto + " está disponível agora.");	
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

}
