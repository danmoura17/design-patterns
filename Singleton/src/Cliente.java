
public class Cliente {
	public static void main(String[] args) {
		Impressora impressora = Impressora.getInstancia();
		System.out.println(impressora.criaRequisicaoWord());
		System.out.println(impressora.criaRequisicaoWord());
		System.out.println(impressora.criaRequisicaoWord());
		System.out.println(impressora.criaRequisicaoExcel());
		System.out.println(impressora.criaRequisicaoFoto());
		
		//Verificando se o singleton está funcionando
		impressora = Impressora.getInstancia();
		
		System.out.println(impressora.gerarRelatorio());
	}
}
