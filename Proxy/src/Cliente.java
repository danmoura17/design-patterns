
public class Cliente {
	
	public static void main(String[] args) {
		Imagem imagem = new ImagemProxy("fotopPerfil.jpg");
		//Imagem será carregada do disco
		imagem.mostrar();
		System.out.println("");
		//Imagem não será carregada do disco
		imagem.mostrar();
	}

}
