
public class DanoFogoStrategy implements DanoStrategy{

	@Override
	public double sofrerDano(Player player, double dano) {
		return player.getHp() - (dano*0.5);
	}

}
