
public class ObserverTeste {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setNomeCliente("Daniel");
		
		Cliente cliente2 = new Cliente();
		cliente2.setNomeCliente("Junior");
		
		Cliente cliente3 = new Cliente();
		cliente3.setNomeCliente("Adriel");
		
		Cliente cliente4 = new Cliente();
		cliente4.setNomeCliente("Breno");
		
		Livro hp = new Livro();
		hp.setNomeLivro("Harry Potter");
		hp.setDisponivel(false);
		
		hp.registrarObserver(cliente1);
		hp.registrarObserver(cliente2);
		hp.registrarObserver(cliente3);
		hp.registrarObserver(cliente4);
		
		// Depois de alguns dias, o Harry Potter chegou
		
		hp.setDisponivel(true);
		
	}

}
