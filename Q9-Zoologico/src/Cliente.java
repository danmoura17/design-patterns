
public class Cliente {
	
	public static void main(String[] args) {
		Animais animal = new Grande();
		Ave ave = animal.criaAve();
		Reptil reptil = animal.criaReptil();
		ave.mostraCriacao();
		reptil.MostraCriacao();
		
		System.out.println("\n----------\n");
		
		animal = new Pequeno();
		ave = animal.criaAve();
		reptil = animal.criaReptil();
		ave.mostraCriacao();
		reptil.MostraCriacao();
	}

}
