
public class ClienteJogador {
	
	public static void main(String[] args) {
		Player player = new Player(200);
		
		System.out.println("Exemplo com Agua");
		System.out.println("O heroi ficou com: " + player.levarDano(new DanoAguaStrategy(), 20)+ " de vida");
		
		System.out.println("\n---------------------------\n");
		
		Player player1 = new Player(200);
		
		System.out.println("Exemplo com Fogo");
		System.out.println("O heroi ficou com: " + player1.levarDano(new DanoFogoStrategy(), 20)+ " de vida");
	}

}
