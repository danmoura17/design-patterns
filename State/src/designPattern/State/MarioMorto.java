package designPattern.State;

public class MarioMorto implements MarioState {

	@Override
	public MarioState pegarCogumelo() {
		System.out.println("Morreu. Pegar cogumelo n�o vai te ajudar!");
		return this;
	}

	@Override
	public MarioState pegarFlor() {
		System.out.println("A flor tem mais nutrientes, voc� virou adubo");
		return this;
	}

	@Override
	public MarioState pegarPena() {
		System.out.println("Que pena... voc� est� morto. Entendeu o trocadilho?");
		return this;
	}

	@Override
	public MarioState levarDano() {
		System.out.println("J� era, morreu. Como vai tomar mais dano?");
		return this;
	}

}
