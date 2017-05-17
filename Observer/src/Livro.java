import java.util.ArrayList;
import java.util.List;

public class Livro implements Subject{
	
	private String nomeLivro;
	
	private boolean disponivel;
	
	private List<Observer> listaDeObservers = new ArrayList<Observer>();

	@Override
	public void registrarObserver(Observer observer) {
		listaDeObservers.add(observer);
		
	}

	@Override
	public void removerObserver(Observer observer) {
		listaDeObservers.remove(observer);
	}

	@Override
	public void notificarObserver() {
		
		System.out.println("Notificando todos os clientes, quando o produto estiver disponível");
		
		for(Observer observer : listaDeObservers){
			
			observer.update(nomeLivro);
			
		}
		
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public List<Observer> getListaDeObservers() {
		return listaDeObservers;
	}

	public void setListaDeObservers(List<Observer> listaDeObservers) {
		this.listaDeObservers = listaDeObservers;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
		if(disponivel == true){
			notificarObserver();
		}
	}

}
