
public class TrechoDeCarro implements Trecho {

	private Integer distancia;
	
	public TrechoDeCarro(Integer distancia){
		setDistancia(distancia);
	}
	
	@Override
	public void MostrarTrecho() {
		System.out.println("Mostrando trecho de Carro  o--o");
	}

	public Integer getDistancia() {
		return distancia;
	}

	public void setDistancia(Integer distancia) {
		this.distancia = distancia;
	}

}
