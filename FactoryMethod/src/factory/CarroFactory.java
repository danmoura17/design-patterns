package factory;

public class CarroFactory {
	
	public Carro gerarCarro(String carro){
		if (carro ==""|| carro ==null){
			return null;
		}
		
		if(carro.toUpperCase().equals("CHEVROLET")){
			return new Chevrolet();	
		} else if (carro.toUpperCase().equals("FORD")){
			return new Ford();
		} else if (carro.toUpperCase().equals("WOLKSVAGEN")){
			return new Wolksvagen();
		}
		
		return null;
	}

}
