
public class ClienteJogador implements Observer
{
	
	private String conta;
	private ContaSubject subject;

	@Override
	public void update(String conta) {
		System.out.println("Oi, sua conta '" + conta + "' foi acessada." );
		
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public ContaSubject getSubject() {
		return subject;
	}

	public void setSubject(ContaSubject subject) {
		this.subject = subject;
	}

}
