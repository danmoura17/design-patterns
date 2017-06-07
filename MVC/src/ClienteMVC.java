
public class ClienteMVC {
	
	public static void main(String[] args) {
		
		Aluno model = pegarAlunoDoBanco();
		
		AlunoView view = new AlunoView();
		
		AlunoController controller = new AlunoController(model, view);
		
		controller.atualizarView();
		
		//muda o nome
		
		controller.setNomeAluno("Mourão");
		
		controller.atualizarView();
		
	}

	private static Aluno pegarAlunoDoBanco() {
		Aluno aluno = new Aluno();
		aluno.setNome("Daniel");
		aluno.setNumero("17");
		return aluno;
	}

}
