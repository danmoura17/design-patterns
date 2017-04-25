package principal;

import factory.Carro;
import factory.CarroFactory;

public class DemoFactoryMethod {
	
	public static void main(String[] args) {
		CarroFactory tipoCarro = new CarroFactory();
		
		Carro meuCarro = tipoCarro.gerarCarro("Chevrolet");
		meuCarro.criarCarro();
		
		meuCarro = tipoCarro.gerarCarro("Ford");
		meuCarro.criarCarro();
		
		meuCarro = tipoCarro.gerarCarro("Wolksvagen");
		meuCarro.criarCarro();
	}

}
