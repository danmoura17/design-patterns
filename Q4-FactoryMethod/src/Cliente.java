
public class Cliente {
	
	public static void main(String[] args) {
		
		FabricaBrasileira fabricaBr = new FabricaBrasileira();
		Conta conta1 = fabricaBr.criarConta("Daniel");
		conta1.criar();
		
		FabricaAmericana fabricaAm = new FabricaAmericana();
		Conta conta2 = fabricaAm.criarConta("Outra Conta");
		conta2.criar();
		
		
		
	}

}
