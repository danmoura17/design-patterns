
public class Impressora {
	
	private static Impressora instancia;
	
	protected int requisicaoDoWord;
	protected int requisicaoDeFoto;
	protected int requisicaoDoExcel;
	
	private Impressora(){
		
	}
	
	public static Impressora getInstancia(){
		if (instancia == null){
			instancia = new Impressora();
		}
		
		return instancia;
	}
	
	public String criaRequisicaoWord(){
		return new String("Criando uma nova requisição do Word para impressora");
	}
	
	public String criaRequisicaoFoto(){
		return new String("Criando uma nova requisição de Foto para impressora");
	}
	
	public String criaRequisicaoExcel(){
		return new String("Criando uma nova requisição do Excel para impressora");
	}
	
	public String gerarRelatorio(){
		return new String("Gerando relatório");
	}
	
	

}
