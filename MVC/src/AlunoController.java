
public class AlunoController {
	
	private Aluno model;
	private AlunoView view;	
	
	public AlunoController (Aluno model, AlunoView view){
		this.model = model;
		this.view = view;
	}
	
	public void setNomeAluno(String nome){
	      model.setNome(nome);		
	   }

	   public String getNomeAluno(){
	      return model.getNome();		
	   }

	   public void setNumeroAluno(String numero){
	      model.setNumero(numero);		
	   }

	   public String getNumeroAluno(){
	      return model.getNumero();		
	   }
	
	public void atualizarView(){
		view.imprimirDetalhesDoAluno(model.getNome(), model.getNumero());
	}

}
