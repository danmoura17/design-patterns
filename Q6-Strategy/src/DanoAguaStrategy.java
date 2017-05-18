
public class DanoAguaStrategy implements DanoStrategy{

	@Override
	public double sofrerDano(Player player, double dano) {
		return player.getHp() - (dano*3);
	}

}
