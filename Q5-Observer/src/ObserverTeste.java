
public class ObserverTeste {
	
	public static void main(String[] args) {
		ClienteJogador jogador1 = new ClienteJogador();
		Conta conta = new Conta();
		
		conta.setConta("usuario@email.com");
		conta.setDisponivel(false);
		
		conta.registrarObserver(jogador1);
		
		conta.setDisponivel(true);
	}

}
