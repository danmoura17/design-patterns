import java.util.ArrayList;
import java.util.List;

public class Caminho implements Trecho{
	
	private List<Trecho> trechos = new ArrayList<Trecho>();
	
	public void adicionarTrecho(Trecho trecho){
		trechos.add(trecho);
	}
	
	public void removerTrecho(Trecho trecho){
		trechos.remove(trecho);
	}

	@Override
	public void mostrarTrecho() {
		for(Trecho trecho : trechos){
			trecho.mostrarTrecho();
		}
		
	}

}
