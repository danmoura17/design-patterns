
public class ImagemReal implements Imagem{
	
	private String nomeArquivo;
	
	public ImagemReal(String nomeArquivo){
		this.nomeArquivo = nomeArquivo;
		carregarDoDisco(nomeArquivo);
	}

	@Override
	public void mostrar() {
		System.out.println("Mostrando " + nomeArquivo);
	}
	
	private void carregarDoDisco(String arquivoNome){
		System.out.println("Carregando " + nomeArquivo);
	}

}
