package designPatterns.decorator;

public class Flocos extends SorveteSabor{
	
	public Flocos (Sorvete sorvete){
		super (sorvete);
	}

	@Override
	public int getQuantidadeBolas() {
		return 1 + this.getSorvete().getQuantidadeBolas();
	}

	@Override
	public double getPreco() {
		return 1.50 + this.getSorvete().getPreco();
	}
}
