
public class BrinquedoDeMenina implements FabricaDeBrinquedo{

	@Override
	public Carro criaCarro() {
		return new PenelopeCharmosa();
	}

	@Override
	public Boneco criaBoneco() {
		return new Barbie();
	}

}
