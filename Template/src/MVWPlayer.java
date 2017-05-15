
public class MVWPlayer extends Player{

	@Override
	public void play() {
		System.out.println("Tocando vídeo em MVW...");
		
	}

	@Override
	public void avancar() {
		System.out.println("Avançando vídeo em MVW...");		
	}

	@Override
	public void stop() {
		System.out.println("Parando vídeo em MVW...");		
	}
	
	public void votando(){
		System.out.println("Colocando uma nova funcionalidade");
	}

}
