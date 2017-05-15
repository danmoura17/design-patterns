
public class MP3Player extends Player{

	@Override
	public void play() {
		System.out.println("Tocando música em MP3...");
		
	}

	@Override
	public void avancar() {
		System.out.println("Avançando música em MP3...");
		
	}

	@Override
	public void stop() {
		System.out.println("Parando música em MP3...");
	}

}
