
public class Pequeno extends Animais{

	@Override
	public Ave criaAve() {
		return new Passarinho();
	}

	@Override
	public Reptil criaReptil() {
		return new Lagarto();
	}
	
	@Override
	public void avisaDepartamento() {
		System.out.println("Avisando departamento de animais Pequenos");
		
	}

	@Override
	public void geraRelatorio() {
		System.out.println("Gerando relatorio de animais Pequenos");
		
	}
	
	public void enviarEmail(){
		System.out.println("Enviando email para dono do Zoologico");
	}
	
	

}
