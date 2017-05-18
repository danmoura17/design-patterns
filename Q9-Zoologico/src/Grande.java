
public class Grande extends Animais {

	@Override
	public Ave criaAve() {
		return new Avestruz();
	}

	@Override
	public Reptil criaReptil() {
		return new Jacare();
	}

	@Override
	public void avisaDepartamento() {
		System.out.println("Avisando departamento de animais Grandes");
		
	}

	@Override
	public void geraRelatorio() {
		System.out.println("Gerando relatorio de animais Grandes");
		
	}

}
