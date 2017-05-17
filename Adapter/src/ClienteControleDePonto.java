
public class ClienteControleDePonto {
	
	public static void main(String[] args) {
		ControleDePonto controleDePonto = new ControleDePonto(01);
		Empregado empregado = new Empregado("Daniel");
		
		controleDePonto.registraEntrada(empregado);
		controleDePonto.registraSaida(empregado);
		
		System.out.println("\n---------------------------------\n");
		
		ControleDePonto novoControleDePonto = new ControleDePontoAdapter(02);
		Empregado empregado2 = new Empregado("Daniel Moura");
		
		novoControleDePonto.registraEntrada(empregado2);
		novoControleDePonto.registraSaida(empregado2);
		
		
	}

}
