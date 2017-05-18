import java.util.ArrayList;
import java.util.List;

public class Conta implements ContaSubject{
	
	private String conta;
	
	private boolean disponivel;
	
	private List<Observer> listaDeObservadores = new ArrayList<Observer>();

	@Override
	public void notificaObserver() {
		System.out.println("Notificando quando a conta for acessada");
		
		for(Observer observer : listaDeObservadores){
			observer.update(conta);
		}
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
		if(disponivel==true){
			notificaObserver();
		}
			
	}

	public List<Observer> getListaDeObservadores() {
		return listaDeObservadores;
	}

	public void setListaDeObservadores(List<Observer> listaDeObservadores) {
		this.listaDeObservadores = listaDeObservadores;
	}

	@Override
	public void registrarObserver(Observer observer) {
		
		listaDeObservadores.add(observer);
	}

}
