
public class Player {
	
	
	private DanoStrategy estrategiaDano;
	private double hp;
	
	public Player (double hp){
		this.hp=hp;
	}
	
	public double getHp() {
		return hp;
	}
	public void setHp(double hp) {
		this.hp = hp;
	}
	public DanoStrategy getEstrategiaDano() {
		return estrategiaDano;
	}
	public void setEstrategiaDano(DanoStrategy estrategiaDano) {
		this.estrategiaDano = estrategiaDano;
	}
	
	public double levarDano(DanoStrategy tipoDeDano, double danoSofrido){
		return tipoDeDano.sofrerDano(this, danoSofrido);
	}

}
