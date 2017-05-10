package designPatterns.decorator;

public class Chocolate extends SorveteSabor{
	
	public Chocolate (Sorvete sorvete){
		super(sorvete);
	}

	@Override
	public int getQuantidadeBolas() {
		return 2 + this.getSorvete().getQuantidadeBolas();
	}

	@Override
	public double getPreco() {
		return 1.75 + this.getSorvete().getPreco();
	}
	
	

}
