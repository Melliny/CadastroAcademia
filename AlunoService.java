public class AlunoService {
    private AlunoView view;

    public AlunoService(AlunoView view) {
        this.view = view;
    }

    public Aluno criarAluno() {
        String nome = view.getNome();
        int idade = view.getIdade();
        String plano = view.getPlano();
        return new Aluno(nome, idade, plano);
    }

    public void exibirAluno(Aluno aluno) {
        view.mostrarAluno(aluno);
    }
}
