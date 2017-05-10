package designPattern.State;

public class Jogador {

	public static void main(String[] args) {
		Mario mario = new Mario();
		
		mario.pegarCogumelo();
		mario.levarDano();
		mario.pegarPena();
		mario.pegarFlor();
		mario.pegarCogumelo();
		mario.levarDano();
		mario.levarDano();
		mario.pegarPena();
		mario.pegarCogumelo();
		mario.levarDano();
		mario.levarDano();
		mario.levarDano();
		mario.pegarPena();
		mario.pegarCogumelo();
		mario.levarDano();
		mario.pegarFlor();
	}

}
