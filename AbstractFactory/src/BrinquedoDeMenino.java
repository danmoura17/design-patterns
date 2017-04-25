
public class BrinquedoDeMenino implements FabricaDeBrinquedo{

	@Override
	public Carro criaCarro() {
		return new RelampagoMcQueen();
	}

	@Override
	public Boneco criaBoneco() {
		return new MaxSteel();
	}

	

}
