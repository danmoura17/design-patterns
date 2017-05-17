
public class Ouvinte {
	
	public static void main(String[] args) {
		Player tocador = new MP3Player();
		tocador.executar();
		
		System.out.println();
		
		tocador = new MVWPlayer();
		tocador.executar();
		((MVWPlayer) tocador).votando();
		
		
	}

}
