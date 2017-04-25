
public class Cliente {
	
	public static void main(String[] args) {
		FabricaDeBrinquedo fabrica = new BrinquedoDeMenino();
		Carro carro = fabrica.criaCarro();
		Boneco boneco = fabrica.criaBoneco();
		carro.mostraDetalhes();
		boneco.mostraDetalhes();
		
		System.out.println("\n-------\n");
		
		fabrica = new BrinquedoDeMenina();
		carro = fabrica.criaCarro();
		boneco = fabrica.criaBoneco();
		carro.mostraDetalhes();
		boneco.mostraDetalhes();
		
	}

}
