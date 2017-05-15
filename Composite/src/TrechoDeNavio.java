
public class TrechoDeNavio implements Trecho{
	
	private Integer distancia;
	
	public TrechoDeNavio(Integer distancia){
		setDistancia(distancia);
	}

	@Override
	public void MostrarTrecho() {
		System.out.println("Mostrando trecho de Navio ..--*--..");		
	}

	public Integer getDistancia() {
		return distancia;
	}

	public void setDistancia(Integer distancia) {
		this.distancia = distancia;
	}

}
