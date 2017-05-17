
public class ClienteDasRotas {
	
	public static void main(String[] args) {
		Trecho trecho1 = new TrechoRua();
		Trecho trecho2 = new TrechoAvenida();
		Trecho trecho3 = new TrechoRodovia();
		
		Caminho caminho1 = new Caminho();
		System.out.println("Indo pro Plano! Partiu!\n");
		caminho1.adicionarTrecho(trecho1);
		caminho1.adicionarTrecho(trecho2);
		caminho1.adicionarTrecho(trecho3);
		caminho1.mostrarTrecho();
		
		System.out.println("\n------------------------\n");
		
		Caminho caminho2 = new Caminho();
		System.out.println("Batidão pro Plano. Indo e voltando!!\n");
		caminho2.adicionarTrecho(caminho1);
		caminho2.adicionarTrecho(trecho2);
		caminho2.adicionarTrecho(trecho1);
		caminho2.mostrarTrecho();
		
		System.out.println("\n------------------------\n");
		
		
	}

}
